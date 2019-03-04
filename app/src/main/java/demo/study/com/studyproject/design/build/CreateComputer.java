package demo.study.com.studyproject.design.build;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by liuhe on 19-3-4.
 * 最后商家用导演类组装计算机。我们只需要提供自己想要的CPU、主板和内存就可以了,至于商家怎
 * 样组装计算机我们无须知道
 */

public class CreateComputer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Builder builder = new MoonComputerBuilder();
        Director director = new Director(builder);
        //组装计算机
        director.createComputer("i7-6700", "玩家至尊", "三星DDR4");

    }
}
