package demo.study.com.studyproject.materialdesign;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-22.
 * TextInputLayout 基本使用,以及更换hint的字体颜色
 * 使用注意事项：使用TextInputLayout 和ScrollView一样只接受一个子元素,并且这个子元素是EditText
 */

public class TextInputLayoutActivity extends AppCompatActivity {

    /* 正则表达式验证邮箱 */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private TextInputLayout tiUserName;
    private TextInputLayout tiPassWord;

    private EditText etUserName;
    private EditText etPassWord;
    private Button btTextInputLayoutLogin;
    private Button btEditTextLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textinput_layout);
        tiUserName = findViewById(R.id.ti_username);
        tiPassWord = findViewById(R.id.ti_password);
        etUserName = findViewById(R.id.ed_username);
        etPassWord = findViewById(R.id.ed_password);
        btEditTextLogin = findViewById(R.id.bt_edidtext_login);
        btTextInputLayoutLogin = findViewById(R.id.bt_textiputlayput_login);

        btTextInputLayoutLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayoutlogin();
            }
        });


        btEditTextLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextlogin();
            }
        });
    }

    /**
     * 验证密码长度
     *
     * @param password
     * @return
     */
    private boolean checkPassword(String password) {
        return password.length() >= 6;
    }

    /**
     * 验证用户名是否是邮箱格式
     *
     * @param userName
     * @return
     */
    private boolean checkUserName(String userName) {
        return Pattern.matches(REGEX_EMAIL, userName);
    }

    /**
     * 使用TextInputLayout的setError显示提示信息样式，会在edittext的上方做提示
     */
    private void textInputLayoutlogin(){
        String userName = tiUserName.getEditText().getText().toString();
        String passWord = tiPassWord.getEditText().getText().toString();

        if (!checkUserName(userName)){
            tiUserName.setErrorEnabled(true);
            tiUserName.setError("请输入正确的邮箱地址");
        }else if (!checkPassword(passWord)){
            tiPassWord.setErrorEnabled(true);
            tiPassWord.setError("密码位数不足6位");
        }else{
            tiUserName.setErrorEnabled(false);
            tiPassWord.setErrorEnabled(false);
            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * 使用EditText的setError显示提示信息样式，会在edittext的左侧做提示
     */
    private void editTextlogin(){
        String userName = etUserName.getText().toString();
        String passWord = etPassWord.getText().toString();

        if (!checkUserName(userName)){
            etUserName.setError("请输入正确的邮箱地址");
        }else if (!checkPassword(passWord)){
            etPassWord.setError("密码位数不足6位");
        }else{
            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
        }
    }
}
