package demo.study.com.studyproject.design.factory;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by liuhe on 19-3-1.
 * 客户端按需求调用工厂类，实例化对象
 */

public class Client extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*  -----------------简单工厂模式客户端调用--------------------  */
        SimpleFactory.createComputer("dell").start();

        /*  -----------------工厂方法模式客户端调用--------------------  */
        ComputerFactory computerFactory = new GDComputerFactory();
        DellComputer dellComputer = computerFactory.createComputer(DellComputer.class);
        dellComputer.start();

        /**
         * 注：对于简单工厂模式,我们都知道其在工厂类中包含了必要的逻辑判断,根据不同的条件来动态实例化
         * 相关的类。对客户端来说,这去除了与具体产品的依赖;但与此同时也会带来一个问题:如果我们要增加
         * 产品,比如我们要生产苹果计算机,就需要在工厂类中添加一个Case分支条件,这违背了开放封闭原则,
         * 对修改也开放了。而工厂方法模式就没有违背这个开放封闭原则。如果我们需要生产苹果计算机,则无须
         * 修改工厂类,直接创建产品即可。
         */

    }
}
