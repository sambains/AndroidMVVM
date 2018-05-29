package com.sambains.androidmvvm.di;

import com.sambains.androidmvvm.factory.NumbersViewModelFactory;
import com.sambains.androidmvvm.model.NumbersModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    NumbersViewModelFactory providesNumbersViewModelFactory() {
        return new NumbersViewModelFactory(new NumbersModel());
    }
}
