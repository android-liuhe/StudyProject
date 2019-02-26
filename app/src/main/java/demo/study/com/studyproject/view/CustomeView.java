package demo.study.com.studyproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Created by liuhe on 19-2-25.
 * view move的几种方式
 * 第一种：通过layout()
 *       在ACTION_MOVE事件中计算偏移量,再调用layout()方法重新放置这个自定义View位置即可。
 *       在每次移动时都会调用layout()方法对屏幕重新布局,从而达到移动View的效果
 * 第二种：通过offsetLeftAndRight()与offsetTopAndBottom()
 *       这两种方法和layout()方法的效果差不多,其使用方式也差不多
 * 第三种：通过LayoutParams
 *       LayoutParams主要保存了一个View的布局参数,因此我们可以通过LayoutParams来改变View的布局参
 *       数从而达到改变View位置的效果。
 * 第四种：动画,代码见：ViewMoveActivity
 * 第五种：scrollTo与scollBy
 *       scrollTo(x,y)表示移动到一个具体的坐标点,而scrollBy(dx,dy)则表示移动的增量为dx、dy。其
 *       中,scollBy最终也是要调用scollTo的。
 *       注：scollTo、scollBy移动的是View的内容，如：对于Button，它的Content就是文本，ImageView就是drawable了。
 * 第六种：Scroller
 *       Scroller本身是不能实现View的滑动的,它需要与View的computeScroll()方法配合才能实现弹性滑动的效果
 *       重写computeScroll()方法,系统会在绘制View的时候在draw()方法中调用该方法。在这个
 *       方法中,我们调用父类的scrollTo()方法并通过Scroller来不断获取当前的滚动值,每滑动一小段距离我们
 *       就调用invalidate()方法不断地进行重绘,重绘就会调用computeScroll()方法,这样我们通过不断地移动
 *       一个小的距离并连贯起来就实现了平滑移动的效果。
 *
 */

public class CustomeView extends View {

    private static final String TAG = "CustomeView";

    private Scroller scroller;

    //手指点击的最后位置
    private int lastX;
    private int lastY;

    public CustomeView(Context context) {
        super(context);
        Log.d(TAG, "CustomeView(Context context)");
    }

    public CustomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "CustomeView(Context context, AttributeSet attrs)");
        scroller = new Scroller(context);
    }

    public CustomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "CustomeView(Context context, AttributeSet attrs, int defStyleAttr)");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        // 获取手指支模点的坐标
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:

                //计算手指移动的偏移量
                int offX = x - lastX;
                int offY = y - lastY;
                Log.d(TAG, "onTouchEvent: offX == " + offX);
                Log.d(TAG, "onTouchEvent: offY == " + offY);


/* -------------------------------第一种------------------------------------------------ */
                //通过调用layout方法来重新放置他的位置
//                layout(getLeft() + offX, + getTop() + offY,
//                        + getRight() + offX, getBottom() + offY);

/* -------------------------------第二种------------------------------------------------ */
                //对left和right进行偏移
//                offsetLeftAndRight(offX);
                //对top和botton进行偏移
//                offsetTopAndBottom(offY);

/* -------------------------------第三种------------------------------------------------ */
//                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
//                layoutParams.leftMargin = getLeft() + offX;
//                layoutParams.topMargin = getTop() + offY;
////                requestLayout();  通过requestLayout()和setLayoutParams()设置都可以
//                setLayoutParams(layoutParams);
                //注：如果通过这种方式移动，不能在布局里边指定居中规则，如android:layout_centerInParent="true",动态设置就会失效

/* -------------------------------第五种------------------------------------------------ */
//                ((View)getParent()).scrollBy(-offX, -offY);
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }
        return true;
    }


/* -------------------------------第六种------------------------------------------------ */
    @Override
    public void computeScroll() {
        super.computeScroll();
        if (scroller.computeScrollOffset()){ // 判断是否还在滚动，还在滚动为true
            ((View)getParent()).scrollTo(scroller.getCurrX(), scroller.getStartY());
            invalidate();
        }
    }

    /**
     * 通过Scroller控制移动的偏移量
     * @param destX
     * @param destY
     */
    public void smoothScrollTo(int destX, int destY){
        int scrollX = getScrollX();
        int delta = destX - scrollX;
        scroller.startScroll(scrollX, 0, delta, destY, 5000);
        invalidate();
    }
}
