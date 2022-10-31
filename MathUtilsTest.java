package com.example.junit;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
class MathUtilsTest {
    static MathUtils mathUtils = new MathUtils();
    @Test
    void test(){
        int expected = 10;
        int actual = mathUtils.add(5,5);
        assertEquals(expected,actual);
    }
    static class NestedClass{
        @Test
        void testCircleArea(){
            boolean flag = false;
            assumeFalse(!flag);
            double expected = 78.53981633974483;
            double actual = mathUtils.circleArea(5);
            assertEquals(expected,actual);
        }
        @Test
        void divide(){
            assertThrows(ArithmeticException.class,()->mathUtils.divide(4,0));
        }
    }
    @Test
    void testCircleArea(){
        double expected = 78.53981633974483;
        double actual = mathUtils.circleArea(5);
        assertEquals(expected,actual);
    }
    @RepeatedTest(2)
    void divide(){
        assertThrows(ArithmeticException.class,()->mathUtils.divide(4,0));
    }
}