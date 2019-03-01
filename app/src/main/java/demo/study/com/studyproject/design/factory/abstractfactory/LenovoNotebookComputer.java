package demo.study.com.studyproject.design.factory.abstractfactory;

import android.util.Log;

/**
 * Created by liuhe on 19-3-1.
 * 具体产品类
 */

public class LenovoNotebookComputer extends NotebookComputer {
    private static final String TAG = "LenovoNotebookComputer";

    @Override
    public void start() {
        Log.d(TAG, "联想笔记本启动");

    }
}
