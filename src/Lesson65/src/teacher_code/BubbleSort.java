package Lesson65.src.teacher_code;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {100, 3, 50, -15, -5, 0, 20, 36, 47, 68};
        System.out.print("--------------original array--------------");
        System.out.println();

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------sorted array--------------");

        bubbleSort2(array);


    }


    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

    }

    public static void bubbleSort2(int[] array) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();


    }
}


