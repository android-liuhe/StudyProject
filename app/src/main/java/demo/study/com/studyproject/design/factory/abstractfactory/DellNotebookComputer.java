package demo.study.com.studyproject.design.factory.abstractfactory;

import android.util.Log;

/**
 * Created by liuhe on 19-3-1.
 * 具体产品类
 */

public class DellNotebookComputer extends NotebookComputer{
    private static final String TAG = "DellNotebookComputer";
    @Override
    public void start() {
        Log.d(TAG, "戴尔笔记本启动");

    }
}
