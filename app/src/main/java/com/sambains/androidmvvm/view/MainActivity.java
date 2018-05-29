package com.sambains.androidmvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sambains.androidmvvm.Application;
import com.sambains.androidmvvm.R;
import com.sambains.androidmvvm.databinding.ActivityMainBinding;
import com.sambains.androidmvvm.factory.NumbersViewModelFactory;
import com.sambains.androidmvvm.model.NumbersModel;
import com.sambains.androidmvvm.viewmodel.NumbersViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NumbersViewModelFactory numbersViewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Application.getAppComponent().inject(this);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(numbersViewModelFactory.create(NumbersViewModel.class));
    }
}
