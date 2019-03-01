package demo.study.com.studyproject.design.factory.abstractfactory;

import android.util.Log;

/**
 * Created by liuhe on 19-3-1.
 * 具体产品类
 */

public class LenovoDesktopComputer extends DesktopComputer {

    private static final String TAG = "LenovoDesktopComputer";

    @Override
    public void start() {
        Log.d(TAG, "联想台式电脑启动");

    }
}
