package demo.study.com.studyproject.design.factory;

import android.util.Log;

/**
 * Created by liuhe on 19-3-1.
 * 具体产品类
 */

public class LenovoComputer extends Computer {
    private static final String TAG = "LenovoComputer";

    @Override
    public void start() {
        Log.d(TAG, "联想电脑开机");
    }
}
