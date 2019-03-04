package demo.study.com.studyproject.design.build;

/**
 * Created by liuhe on 19-3-4.
 * 我要组装一台计算机,计算机被抽象为Computer类,它有3个部件:CPU、主板和内存,并在里面提供
 * 了3个方法分别用来设置CPU、主板和内存
 */

public class Computer {

    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
