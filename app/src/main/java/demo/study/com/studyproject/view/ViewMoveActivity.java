package demo.study.com.studyproject.view;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-25.
 * View 的几种移动方式
 */

public class ViewMoveActivity extends Activity {

    private CustomeView customeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_move_layout);

        customeView = findViewById(R.id.custom);

/* -------------------------------第四种------------------------------------------------ */
        //此为移动化并不能改变View的位置参数，所以点击事件还在原位置
//        customeView.setAnimation(AnimationUtils.loadAnimation(this, R.anim.translate));
        //此为属性动画，不仅可以执行动画,还能够改变View的位置参数
//        ObjectAnimator.ofFloat(customeView, "translationX", 0, 300)
//                .setDuration(1000).start();


/* -------------------------------第六种------------------------------------------------ */
        customeView.smoothScrollTo(-400, 0);
    }
}
