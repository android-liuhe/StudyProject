package demo.study.com.studyproject.view.dispath;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by liuhe on 19-3-15.
 * 自动以ViewGroup
 */

public class CustomeGroupView extends RelativeLayout {

    public CustomeGroupView(Context context) {
        super(context);
    }

    public CustomeGroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomeGroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 注：如果viewgroup当中view的onTouchEvent反回了false，那么ViewGroup的onTouchEvent就会被调用，如果
     *  ViewGroup的onTouchEvent是默认的super.onTouchEvent(event)情况时：
     *        1.这个ViewGroup设置了setOnClickListener,那么这个事件就被setOnClickListener消费了，不会在Activity继续传递
     *        2.如果这个ViewGroup没有设置setOnClickListener，那么事件会继续向上反馈，Activity的onTouchEvent则会被调用。
     *  ViewGroup的onTouchEvent是默认的true情况时：
     *       此次事件会被消费，不会继续向上反馈
     *  ViewGroup的onTouchEvent是默认的false情况时：
     *       事件会继续向上反馈，Activity的onTouchEvent则会被调用。
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("ViewDispathActivity", "CustomeGroupView onTouchEvent: ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("ViewDispathActivity", "CustomeGroupView onInterceptTouchEvent: ");
        return super.onInterceptTouchEvent(ev);
    }
}
