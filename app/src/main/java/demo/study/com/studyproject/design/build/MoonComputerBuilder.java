package demo.study.com.studyproject.design.build;

/**
 * Created by liuhe on 19-3-4.
 * 商家实现了抽象的Builder类,MoonComputerBuilder类用于组装计算机
 */

public class MoonComputerBuilder extends Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setmCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        computer.setmMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        computer.setmRam(ram);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
