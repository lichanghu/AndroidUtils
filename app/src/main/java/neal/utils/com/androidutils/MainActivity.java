package neal.utils.com.androidutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import neal.utils.com.library.ExitAppUtils;
import neal.utils.com.library.KLog;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KLog.d("-------------------------");
        KLog.d("tag","--------------------");
        ExitAppUtils.getInstance().addActivity(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ExitAppUtils.getInstance().delActivity(this);
    }
}
