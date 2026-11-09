
package com.bits.leave;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeaveCalculatorTest {

    @Test
    public void testLeaveBalance() {
        LeaveCalculator calculator = new LeaveCalculator(30, 10, 1000);
        assertEquals(20.0, calculator.calculateLeaveBalance(), 0.01);
    }

    @Test
    public void testLeaveEncashment() {
        LeaveCalculator calculator = new LeaveCalculator(30, 10, 1000);
        assertEquals(20000.0, calculator.calculateLeaveEncashment(), 0.01);
    }

    @Test
    public void testZeroLeaveBalance() {
        LeaveCalculator calculator = new LeaveCalculator(20, 20, 1000);
        assertEquals(0.0, calculator.calculateLeaveBalance(), 0.01);
    }
}
