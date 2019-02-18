package demo.study.com.studyproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.study.com.studyproject.recycleview.RecycleViewActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    /*  RecycleViewActivity */
    private Button btStartRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        btStartRecycle = findViewById(R.id.start_recycle);

        btStartRecycle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.start_recycle:
                Intent intent = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
