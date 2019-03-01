package demo.study.com.studyproject.design.factory.abstractfactory;

/**
 * Created by liuhe on 19-3-1.
 * 具体工厂类
 */

public class LenovoFactory extends ComputerFactory{

    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();
    }
}
