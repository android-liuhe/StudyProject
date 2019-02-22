package demo.study.com.studyproject.materialdesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-21.
 * SnackBar
 */

public class SnackBarActivity extends AppCompatActivity {

    private Button btShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_layout);

        btShow = findViewById(R.id.bt_show);

        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackBar(view);
            }
        });
    }

    /**
     * @param view snackbar显示的父控件，选择合适的父控件保证snackbar显示在正确的位置上
     * 注意事项：1.Snackbar所在activity必须要直接或间接的继自AppCompatActivity.
     *         2.activity主题必须要使用Theme.AppCompat下的主题。
     */
    private void showSnackBar(View view) {
        Snackbar.make(view, "标题", Snackbar.LENGTH_LONG)
                .setAction("点击事件", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(SnackBarActivity.this, "点击了SnackBar",
                                Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }
}
