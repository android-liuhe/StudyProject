package demo.study.com.studyproject.design.factory;

/**
 * Created by liuhe on 19-3-1.
 * 工厂方法模式 抽象工厂类
 */

public abstract class ComputerFactory {

    public abstract <T extends Computer> T createComputer(Class<T> clz);

}
