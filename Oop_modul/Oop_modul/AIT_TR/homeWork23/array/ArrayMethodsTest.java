package homeWork23.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    void sumElOfArrayTest() {
        int[] num ={10,20,30,40,50};  //150
        assertEquals(150,arrayMethods.sumElOfArray(num));
    }

    @Test
    void sumElOfOddIndexTest() {
        int[] num ={10,20,30,40,50};  //150
        assertEquals(60,arrayMethods.sumElOfOddIndex(num));
    }
}