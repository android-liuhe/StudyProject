package demo.study.com.studyproject.design.factory;

/**
 * Created by liuhe on 19-3-1.
 * 工厂方法模式，具体工厂类
 * 其继承抽象工厂,通过反射来生产不同厂家的计算机
 */

public class GDComputerFactory extends ComputerFactory {

    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {

        Computer computer = null;
        String className = clz.getName();

        try {
            computer = (Computer) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return (T) computer;
    }
}
