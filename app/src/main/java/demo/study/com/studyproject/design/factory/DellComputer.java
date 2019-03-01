package demo.study.com.studyproject.design.factory;

import android.util.Log;

/**
 * Created by liuhe on 19-3-1.
 * 具体产品类
 */

public class DellComputer extends Computer {
    private static final String TAG = "DellComputer";

    @Override
    public void start() {
        Log.d(TAG, "戴尔电脑开机");

    }
}
