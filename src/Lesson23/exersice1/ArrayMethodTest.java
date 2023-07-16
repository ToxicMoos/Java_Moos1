package Lesson23.exersice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodTest {
    //поля класса
    ArrayMethod arrayMethod;

    @BeforeEach
    void setUp() {
        arrayMethod = new ArrayMethod();
    }

    @Test
    void positiveNumbersTest() {
        int[] arr = {1,-2,3,-4,5};
        assertEquals(3,arrayMethod.positiveNumbers(arr));

    }

    @Test
    void negativeNumbers() {
        int[] x  = {10,20,30,40,-50};
        assertEquals(1,arrayMethod.negativeNumbers(x));
    }

    @Test
    void eventNumbersTest() {
        int[] y  = {10,21,33,40,-50};
        assertEquals(3,arrayMethod.eventNumbers(y));
    }

    @Test
    void zeroNubbersTest() {
        int[] z  = {1,-2,0,4,0};
        assertEquals(2,arrayMethod.zeroNubbers(z));
    }
}