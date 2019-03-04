package demo.study.com.studyproject.design.build;

/**
 * Created by liuhe on 19-3-4.
 * 商家的导演类用来规范组装计算机的流程规范,先安装主板,再安装CPU,最后安装内存并组装成计算机
 */

public class Director {

    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String board, String ram){

        this.builder.buildMainboard(board);
        this.builder.buildCpu(cpu);
        this.builder.buildRam(ram);
        return builder.create();
    }
}
