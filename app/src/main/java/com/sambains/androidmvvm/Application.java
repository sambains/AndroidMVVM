package com.sambains.androidmvvm;

import com.sambains.androidmvvm.di.AppComponent;
import com.sambains.androidmvvm.di.AppModule;
import com.sambains.androidmvvm.di.DaggerAppComponent;

public class Application extends android.app.Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
