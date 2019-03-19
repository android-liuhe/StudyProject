package demo.study.com.studyproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.study.com.studyproject.materialdesign.MaterialDesignMainActivity;
import demo.study.com.studyproject.notification.NotificationActivity;
import demo.study.com.studyproject.recycleview.RecycleViewActivity;
import demo.study.com.studyproject.view.ViewMoveActivity;
import demo.study.com.studyproject.view.dispath.ViewDispathActivity;
import demo.study.com.studyproject.view.sliding.DemoActivity_1;
import demo.study.com.studyproject.view.sliding.DemoActivity_2;

public class MainActivity extends Activity implements View.OnClickListener {

    /*  RecycleViewActivity */
    private Button btStartRecycle;
    /*  MaterialDesign */
    private Button btStartMaterialDesign;
    /*  Notiffication */
    private Button btNotification;
    /*  View相关 */
    private Button btView;
    /*  View事件分发 */
    private Button btViewDispatch;
    /*  外部解决滑动冲突 */
    private Button btSlidingOne;
    /*  内部解决滑动冲突 */
    private Button btSlidingTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        btStartRecycle = findViewById(R.id.start_recycle);
        btStartMaterialDesign = findViewById(R.id.start_marterial);
        btNotification = findViewById(R.id.bt_notification);
        btView = findViewById(R.id.bt_view);
        btViewDispatch = findViewById(R.id.bt_view_dispatch);
        btSlidingOne = findViewById(R.id.bt_sliding_one);
        btSlidingTwo = findViewById(R.id.bt_sliding_two);

        btStartRecycle.setOnClickListener(this);
        btStartMaterialDesign.setOnClickListener(this);
        btNotification.setOnClickListener(this);
        btView.setOnClickListener(this);
        btViewDispatch.setOnClickListener(this);
        btSlidingOne.setOnClickListener(this);
        btSlidingTwo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.start_recycle:
                Intent intent1 = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(intent1);
                break;
            case R.id.start_marterial:
                Intent intent2 = new Intent(MainActivity.this, MaterialDesignMainActivity.class);
                startActivity(intent2);
                break;
            case R.id.bt_notification:
                Intent intent3 = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent3);
            case R.id.bt_view:
                Intent intent4 = new Intent(MainActivity.this, ViewMoveActivity.class);
                startActivity(intent4);
                break;
            case R.id.bt_view_dispatch:
                Intent intent5 = new Intent(MainActivity.this, ViewDispathActivity.class);
                startActivity(intent5);
                break;
            case R.id.bt_sliding_one:
                Intent intent6 = new Intent(MainActivity.this, DemoActivity_1.class);
                startActivity(intent6);
                break;
            case R.id.bt_sliding_two:
                Intent intent7 = new Intent(MainActivity.this, DemoActivity_2.class);
                startActivity(intent7);
                break;
            default:
                break;
        }

    }
}
