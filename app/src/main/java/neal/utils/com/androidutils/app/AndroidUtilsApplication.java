package neal.utils.com.androidutils.app;

import android.app.Application;

import neal.utils.com.library.KLog;

/**
 * Created by Neal on 16/9/7.
 */
public class AndroidUtilsApplication extends Application {

    public static AndroidUtilsApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //使用AndroidUtils.Klog打印信息 false是关闭信息
        KLog.init(true);

    }
}
