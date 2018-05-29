package com.sambains.androidmvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sambains.androidmvvm.R;
import com.sambains.androidmvvm.databinding.ActivityMainBinding;
import com.sambains.androidmvvm.model.NumbersModel;
import com.sambains.androidmvvm.viewmodel.NumbersViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new NumbersViewModel(new NumbersModel()));
    }
}
