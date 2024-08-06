package com.M10.tests;

import com.M10.CalculatorService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService calculator = new CalculatorService();
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        CalculatorService calculator = new CalculatorService();
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2, "5 - 3 should equal 2");
    }
}
