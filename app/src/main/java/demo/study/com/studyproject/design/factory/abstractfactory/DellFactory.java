package demo.study.com.studyproject.design.factory.abstractfactory;

/**
 * Created by liuhe on 19-3-1.
 * 具体工厂类
 */

public class DellFactory extends ComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new DellDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new DellNotebookComputer();
    }
}
