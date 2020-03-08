package com;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @Parameters({"3|2", "-6|5", "6|-5", "-9|-8"})
    public void shouldReturnSumValues(int valueOne, int valueTwo) {
        Assert.assertEquals(valueOne + valueTwo, calculator.sum(valueOne, valueTwo));
    }

    @Test
    @Parameters({"4|4|0", "5|-7|12", "-9|8|-17", "-8|-9|1"})
    public void shouldReturnMinusValue(int valueOne, int valueTwo, int expected) {
        Assert.assertEquals(expected, calculator.minus(valueOne, valueTwo));
    }

}

/*
 * 3 2
 * -6 5
 * 6 -5
 * -9 -8
 * */
