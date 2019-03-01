package demo.study.com.studyproject.design.factory.abstractfactory;

/**
 * Created by liuhe on 19-3-1.
 * 抽像工厂类
 */

public abstract class ComputerFactory {

    public abstract DesktopComputer createDesktopComputer();
    public abstract NotebookComputer createNotebookComputer();

}
