package cowtribe.cowtribedatacollectionapp;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by M RAFFICK on 6/23/2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(4000);
    }
}
