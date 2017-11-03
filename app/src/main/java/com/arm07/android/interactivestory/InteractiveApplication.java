package com.arm07.android.interactivestory;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * Created by rashmi on 11/1/2017.
 */

public class InteractiveApplication extends Application {


    /* Static way of setting the orientation to portrait mode : In manifest file beside
    the activity name -  include android:screenOrientation="portrait"*/
    @Override
    public void onCreate() {

        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }

            @Override
            public void onActivityStarted(Activity activity) {
            }
            @Override
            public void onActivityResumed(Activity activity) {

            }
            @Override
            public void onActivityPaused(Activity activity) {

            }
            @Override
            public void onActivityStopped(Activity activity) {

            }
            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }
            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}

