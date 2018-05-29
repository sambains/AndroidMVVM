package com.sambains.androidmvvm.model;

public class NumbersModel {

    private int numberOne;
    private int numberTwo;
    private int numberThree;
    private int numberFour;
    private int numberFive;
    private int numberSix;
    private int sum;
    private boolean animating;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
        calculateSum();
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
        calculateSum();
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
        calculateSum();
    }

    public int getNumberFour() {
        return numberFour;
    }

    public void setNumberFour(int numberFour) {
        this.numberFour = numberFour;
        calculateSum();
    }

    public int getNumberFive() {
        return numberFive;
    }

    public void setNumberFive(int numberFive) {
        this.numberFive = numberFive;
        calculateSum();
    }

    public int getNumberSix() {
        return numberSix;
    }

    public void setNumberSix(int numberSix) {
        this.numberSix = numberSix;
        calculateSum();
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isAnimating() {
        return animating;
    }

    public void setAnimating() {
        this.animating = !animating;
    }

    private void calculateSum() {
        sum = getNumberOne() + getNumberTwo() + getNumberThree() + getNumberFour() + getNumberFive() + getNumberSix();
    }
}
