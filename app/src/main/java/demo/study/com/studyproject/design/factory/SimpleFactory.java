package demo.study.com.studyproject.design.factory;

/**
 * Created by liuhe on 19-3-1.
 * 简单工厂模式工厂类，实例化相应品牌的计算机对象
 */

public class SimpleFactory {

    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "dell":
                computer = new DellComputer();
                break;
            default:
                break;
        }
        return computer;
    }

}
