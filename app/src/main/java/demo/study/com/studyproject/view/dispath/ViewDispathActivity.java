package demo.study.com.studyproject.view.dispath;

import android.app.Activity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-3-15.
 * View的时间分发demo，主要为了验证android开发艺术探索
 */

public class ViewDispathActivity extends Activity {

    private static final String TAG = "ViewDispathActivity";
    private CustomeGroupView customeGroupView;
    private CustomeDispathView customeDispathView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_dispath_layout);
        customeGroupView = findViewById(R.id.custome_group);
        customeDispathView = findViewById(R.id.custome_view);

        /**
         * 如果返回false，view的onTouchEvent会被调用，
         * 如果返回true，view的onTouchEvent就不会被调用。
         * 所以个View设置setOnTouchListener比View的onTouchEvent优先级要高
         */
        customeDispathView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "customeDispathView onTouch: ");
                return false;
            }
        });

        /**
         * onClick是在View的onTouchEvent当中调用的，所以优先级最低
         */
        customeDispathView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "customeDispathView onClick: ");
            }
        });

        customeGroupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "ViewDiscustomeGroup onTouch: ");
                return false;
            }
        });

        customeGroupView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "customeGroupView onClick: ");
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "ViewDispathActivity onTouchEvent: ");
        return super.onTouchEvent(event);
    }
}
