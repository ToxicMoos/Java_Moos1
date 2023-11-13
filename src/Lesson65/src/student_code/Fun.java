package Lesson65.src.student_code;

import java.util.Arrays;

public class Fun {
    public static void main(String[] args) {
        int[] array = {100, 55, 68, 2, 0, -15, 86, 91, 11, -30};
        System.out.println("----------Original-----------");
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------");
        mergeSort(array);
        printArray(array);



    }
    public static void mergeSort(int[] arr){
        if (arr.length >1){
            int med = arr.length/2;

            int[] left = new int[med];
            int[] right = new int[arr.length-med];

            for (int i = 0; i < med; i++) {
                left[i] = arr[i];
            }
            for (int i = med; i < arr.length; i++) {
                right[i-med] = arr[i];
            }
            //sorting left and right
            mergeSort(left);
            mergeSort(right);

            //merge array , left and right
            merge(arr,left,right);


        }
    }
    public static void merge(int[] array ,int[]left ,int[]right){
        int i = 0, j = 0, k = 0;
        while (i< left.length && j < right.length){
            if(left[i]< right[j]){
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i< left.length){
            array[k++]= left[i++];
        }
        while (j< right.length){
            array[k++]= right[j++];
        }

    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + "  " );
        }
        System.out.println();
    }
}
