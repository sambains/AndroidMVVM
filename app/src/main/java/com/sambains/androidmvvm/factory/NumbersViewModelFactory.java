package com.sambains.androidmvvm.factory;

import android.databinding.BaseObservable;

import com.sambains.androidmvvm.model.NumbersModel;
import com.sambains.androidmvvm.viewmodel.NumbersViewModel;

public class NumbersViewModelFactory {

    private final NumbersModel numbersModel;

    public NumbersViewModelFactory(NumbersModel numbersModel) {
        this.numbersModel = numbersModel;
    }

    public <T extends BaseObservable> T create(Class<T> viewModelClass) {
        if (viewModelClass.isAssignableFrom(NumbersViewModel.class)) {
            return (T) new NumbersViewModel(numbersModel);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
