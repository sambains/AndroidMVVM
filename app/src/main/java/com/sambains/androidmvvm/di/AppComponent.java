package com.sambains.androidmvvm.di;

import com.sambains.androidmvvm.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
