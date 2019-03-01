package demo.study.com.studyproject.design.factory.abstractfactory;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by liuhe on 19-3-1.
 * 客户端调用类
 */

public class Client extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ComputerFactory lenovoFactory = new LenovoFactory();
        lenovoFactory.createDesktopComputer().start();
        lenovoFactory.createNotebookComputer().start();

        ComputerFactory dellFactory = new DellFactory();
        dellFactory.createDesktopComputer().start();
        dellFactory.createNotebookComputer().start();

        /**
         * 注：
         * 优点：
         * 具体类的创建实例过程与客户端分离，客户端通过工厂的抽象接口操纵实例，客户端并不知道具体的实现是谁。
         * 缺点：
         * 如果增加新的产品族则也需要修改抽象工厂和所有的具体工厂。抽象工厂模式的使用场景
         * 使用场景：
         * 一个系统不依赖于产品线实例如何被创建、组合和表达的细节。
         * 系统中有多于一个的产品线，而每次只使用其中某一产品线。
         * 一个产品线（或是一组没有任何关系的对象）拥有相同的约束。
         */
    }
}
