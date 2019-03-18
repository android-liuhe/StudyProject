package demo.study.com.studyproject.view.dispath;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by liuhe on 19-3-15.
 * View的时间分发demo，主要为了验证android开发艺术探索
 */

public class CustomeDispathView extends View {

    private Paint mPaint;

    public CustomeDispathView(Context context) {
        super(context);
    }

    public CustomeDispathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomeDispathView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("ViewDispathActivity", "CustomeDispathView onTouchEvent: ");
        return super.onTouchEvent(event);
    }


}
