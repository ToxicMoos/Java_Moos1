package Lesson65.src.student_code;

import java.util.Arrays;

public class BubbleSort4 {
    public static void main(String[] args) {
        int[] arr = { 50, 20, 1};

        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            System.out.println("i " + Arrays.toString(arr));
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;


                    System.out.println("j " + Arrays.toString(arr));
                    if (sorted){
                        break;
                }

            }

        }

    }

}

    static int add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;


    }
}
