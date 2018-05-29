package com.sambains.androidmvvm;

import com.sambains.androidmvvm.model.NumbersModel;
import com.sambains.androidmvvm.viewmodel.NumbersViewModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumbersViewModelTest {

    private NumbersViewModel numbersViewModel;
    private NumbersModel numbersModel;

    @Before
    public void setUp() {
        numbersModel = new NumbersModel();
        numbersViewModel = new NumbersViewModel(numbersModel);
    }

    @Test
    public void testPartialSetOfNumbers() {
        numbersViewModel.firstNumberTextChange("1");

        assertEquals(1, numbersViewModel.getSum());

        numbersViewModel.secondNumberTextChange("10");

        assertEquals(11, numbersViewModel.getSum());

        numbersViewModel.thirdNumberTextChange("0");
        numbersViewModel.fourthNumberTextChange("0");
        numbersViewModel.fifthNumberTextChange("0");

        numbersViewModel.sixthNumberTextChange("57");

        assertEquals(68, numbersViewModel.getSum());
    }

    @Test
    public void testAllSetOfNumbers() {
        numbersViewModel.firstNumberTextChange("1");

        assertEquals(1, numbersViewModel.getSum());

        numbersViewModel.secondNumberTextChange("10");

        assertEquals(11, numbersViewModel.getSum());

        numbersViewModel.thirdNumberTextChange("329");

        assertEquals(340, numbersViewModel.getSum());

        numbersViewModel.fourthNumberTextChange("12");

        assertEquals(352, numbersViewModel.getSum());

        numbersViewModel.fifthNumberTextChange("8");

        assertEquals(360, numbersViewModel.getSum());

        numbersViewModel.sixthNumberTextChange("87");

        assertEquals(447, numbersViewModel.getSum());
    }

    @Test
    public void testPartialInputsMadeEmpty() {
        numbersViewModel.firstNumberTextChange("1");
        numbersViewModel.secondNumberTextChange("10");
        numbersViewModel.thirdNumberTextChange("329");
        numbersViewModel.fourthNumberTextChange("12");
        numbersViewModel.fifthNumberTextChange("8");
        numbersViewModel.sixthNumberTextChange("87");

        assertEquals(447, numbersViewModel.getSum());

        numbersViewModel.firstNumberTextChange("");

        assertEquals(446, numbersViewModel.getSum());

        numbersViewModel.thirdNumberTextChange("");

        assertEquals(117, numbersViewModel.getSum());

        numbersViewModel.sixthNumberTextChange("");

        assertEquals(30, numbersViewModel.getSum());
    }

    @Test
    public void testPartialInputsMadeNegative() {
        numbersViewModel.firstNumberTextChange("1");
        numbersViewModel.secondNumberTextChange("10");
        numbersViewModel.thirdNumberTextChange("329");
        numbersViewModel.fourthNumberTextChange("12");
        numbersViewModel.fifthNumberTextChange("8");
        numbersViewModel.sixthNumberTextChange("87");

        assertEquals(447, numbersViewModel.getSum());

        numbersViewModel.firstNumberTextChange("-9");

        assertEquals(437, numbersViewModel.getSum());

        numbersViewModel.thirdNumberTextChange("-9273");

        assertEquals(-9165, numbersViewModel.getSum());

        numbersViewModel.sixthNumberTextChange("134");

        assertEquals(-9118, numbersViewModel.getSum());
    }

    @Test
    public void testAllInputsAsNegative() {
        numbersViewModel.firstNumberTextChange("-292");

        assertEquals(-292, numbersViewModel.getSum());

        numbersViewModel.secondNumberTextChange("-2");

        assertEquals(-294, numbersViewModel.getSum());

        numbersViewModel.thirdNumberTextChange("-28");

        assertEquals(-322, numbersViewModel.getSum());

        numbersViewModel.fourthNumberTextChange("-98");

        assertEquals(-420, numbersViewModel.getSum());

        numbersViewModel.fifthNumberTextChange("-27");

        assertEquals(-447, numbersViewModel.getSum());

        numbersViewModel.sixthNumberTextChange("-0");

        assertEquals(-447, numbersViewModel.getSum());
    }

    @Test
    public void testFlashing() {
        assertFalse(numbersViewModel.isAnimating());

        numbersViewModel.onSumClicked();

        assertTrue(numbersViewModel.isAnimating());

        numbersViewModel.onSumClicked();

        assertFalse(numbersViewModel.isAnimating());
    }
}
