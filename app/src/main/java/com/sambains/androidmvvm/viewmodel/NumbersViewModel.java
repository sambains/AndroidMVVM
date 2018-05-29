package com.sambains.androidmvvm.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

import com.sambains.androidmvvm.BR;
import com.sambains.androidmvvm.helpers.StringHelper;
import com.sambains.androidmvvm.model.NumbersModel;

public class NumbersViewModel extends BaseObservable {

    private NumbersModel numbersModel;

    public NumbersViewModel(NumbersModel numbersModel) {
        this.numbersModel = numbersModel;
    }

    public void firstNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberOne(Integer.parseInt(input));
        } else {
            numbersModel.setNumberOne(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void secondNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberTwo(Integer.parseInt(input));
        } else {
            numbersModel.setNumberTwo(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void thirdNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberThree(Integer.parseInt(input));
        } else {
            numbersModel.setNumberThree(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void fourthNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberFour(Integer.parseInt(input));
        } else {
            numbersModel.setNumberFour(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void fifthNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberFive(Integer.parseInt(input));
        } else {
            numbersModel.setNumberFive(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void sixthNumberTextChange(String input) {
        if (StringHelper.stringIsNumber(input)) {
            numbersModel.setNumberSix(Integer.parseInt(input));
        } else {
            numbersModel.setNumberSix(0);
        }
        notifyPropertyChanged(BR.sum);
    }

    public void onSumClicked() {
        numbersModel.setAnimating();
        notifyPropertyChanged(BR.animating);
    }

    @Bindable
    public int getSum() {
        return numbersModel.getSum();
    }

    @Bindable
    public boolean isAnimating() {
        return numbersModel.isAnimating();
    }

    @BindingAdapter("flashing")
    public static void setFlashing(final View view, boolean animate) {
        if (view.getAnimation() != null) {
            view.getAnimation().cancel();
        }

        if (animate) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
            alphaAnimation.setDuration(500);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(Animation.INFINITE);
            alphaAnimation.setRepeatMode(Animation.REVERSE);
            view.startAnimation(alphaAnimation);
        } else {
            view.setVisibility(View.VISIBLE);
        }
    }
}
