package demo.study.com.studyproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.study.com.studyproject.materialdesign.MaterialDesignMainActivity;
import demo.study.com.studyproject.notification.NotificationActivity;
import demo.study.com.studyproject.recycleview.RecycleViewActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    /*  RecycleViewActivity */
    private Button btStartRecycle;
    /*  MaterialDesign */
    private Button btStartMaterialDesign;
    /*  Notiffication */
    private Button btNotification;

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

        btStartRecycle.setOnClickListener(this);
        btStartMaterialDesign.setOnClickListener(this);
        btNotification.setOnClickListener(this);

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
            default:
                break;
        }

    }
}
