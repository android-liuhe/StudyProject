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

        btStartRecycle.setOnClickListener(this);
        btStartMaterialDesign.setOnClickListener(this);
        btNotification.setOnClickListener(this);
        btView.setOnClickListener(this);
        btViewDispatch.setOnClickListener(this);

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
            default:
                break;
        }

    }
}
