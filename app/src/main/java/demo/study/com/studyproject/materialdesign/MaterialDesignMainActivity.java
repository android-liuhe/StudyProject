package demo.study.com.studyproject.materialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-21.
 * MaterialDesign 集合
 *
 * 注意事项：1.MaterialDesign的控件所在activity必须要直接或间接的继自AppCompatActivity.
 *         2.activity主题必须要使用Theme.AppCompat下的主题。
 *
 */

public class MaterialDesignMainActivity extends Activity implements View.OnClickListener {

    private Button btSnackBar;
    private Button btTextInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_design_main_layout);
        btSnackBar = findViewById(R.id.bt_snackbar);
        btTextInputLayout = findViewById(R.id.bt_text_input_layout);
        btSnackBar.setOnClickListener(this);
        btTextInputLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_snackbar:
                Intent intent1 = new Intent(MaterialDesignMainActivity.this, SnackBarActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt_text_input_layout:
                Intent intent2 = new Intent(MaterialDesignMainActivity.this, TextInputLayoutActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
