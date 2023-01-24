package com.example.configchangeskotlin
import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

class MyApplication : Application(){
    private var singleton: MyApplication? = null
    private var TAG: String = "MyApplication";
    fun getInstance():MyApplication? = singleton
    // Returns the application instance
     override fun onCreate() {
        super.onCreate();
         singleton = this
        Log.d(TAG, "onCreate");
    }
//    public static MyApplication getInstance()
//    {
//        return singleton;
//    }



    override fun onLowMemory() {
        super.onLowMemory();
        Log.d(TAG, "onLowMemory");
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level);
        Log.d(TAG, "onTrimMemory");
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged");
    }
}