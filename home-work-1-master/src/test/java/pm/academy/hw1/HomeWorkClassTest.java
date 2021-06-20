package pm.academy.hw1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkClassTest {

    private HomeWorkClass homeWork;

    @BeforeEach void setUp() {
        homeWork = new HomeWorkClass();
    }

    /**
     * Implementation of getPrimitiveFife from {@link HomeWorkClass}
     * should return value of 5
     *
     * @see HomeWorkClass#getPrimitiveFive()
     * */
    @Test void getPrimitiveFife() {
        int primitiveFive = homeWork.getPrimitiveFive();
        assertEquals(5, primitiveFive);
    }

    /**
     * Return min Integer bound in implementation
     */
    @Test void getMinimumInteger() {
        assertEquals(Integer.MIN_VALUE, homeWork.getMinInteger());
    }

    /**
     * Return max Integer bound in implementation
     */
    @Test void getMaximumInteger() {
        assertEquals(Integer.MAX_VALUE, homeWork.getMaxInteger());
    }

    /**
     * Return min Long bound in implementation
     */
    @Test void getMinimumLong() {
        assertEquals(Long.MIN_VALUE, homeWork.getMinLong());
    }

    /**
     * Return max Integer bound in implementation
     */
    @Test void getMaximumLong() {
        assertEquals(Long.MAX_VALUE, homeWork.getMaxLong());
    }

    /**
     * Write values from 1 to 10 in cycle into string and return result
     */
    @Test void writeToString() {
        assertEquals("12345678910", homeWork.writeToString());
    }

    /**
     * Check if value is negative and return boolean value
     */
    @Test void checkForNegativeValue() {
        assertTrue(homeWork.checkForNegativeValue(-5));
        assertFalse(homeWork.checkForNegativeValue(0));
        assertFalse(homeWork.checkForNegativeValue(100));
    }

    /**
     * Find max value of two numbers
     */
    @Test void findMaxValue() {
        assertEquals(10, homeWork.findMaxValue(10, 0));
        assertEquals(1, homeWork.findMaxValue(1, 1));
        assertEquals(-10, homeWork.findMaxValue(-10, -100));
    }

    /**
     * Get number of weekday using switch operator.
     * In case of no weekday provided value -1 should be returned.
     */
    @Test void getWeekday() {
        assertEquals(1, homeWork.getWeekday(Weekdays.MONDAY));
        assertEquals(3, homeWork.getWeekday(Weekdays.WEDNESDAY));
        assertEquals(5, homeWork.getWeekday(Weekdays.FRIDAY));
        assertEquals(-1, homeWork.getWeekday(null));
    }

    /**
     * Find the factorial of entered values. If value less 0 then return -1
     */
    @Test void getFactorial() {
        assertEquals(3628800, homeWork.getFactorial(10));
        assertEquals(-1, homeWork.getFactorial(-2));
        assertEquals(1, homeWork.getFactorial(0));
    }
}
