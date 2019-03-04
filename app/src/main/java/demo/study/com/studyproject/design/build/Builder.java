package demo.study.com.studyproject.design.build;

/**
 * Created by liuhe on 19-3-4.
 * 商家组装计算机有一套组装方法的模板,就是一个抽象的 Builder 类,其里面提供了安装CPU、主板和
 * 内存的方法,以及组装成计算机的create方法
 */

public abstract class Builder {

    public abstract void buildCpu(String cpu);
    public abstract void buildMainboard(String mainboard);
    public abstract void buildRam(String ram);
    public abstract Computer create();
}
