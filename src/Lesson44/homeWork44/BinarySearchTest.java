package Lesson44.homeWork44;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private int[] arr;
    private int key;

    @BeforeEach
    void setUp() {

    }

    @Test
    void binarySearch() {
        int[] arr  = {1,5,3,2,4};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,3);
        index = index >= 0 ? index : index +1  ;
        assertEquals(2,index);

    }
}