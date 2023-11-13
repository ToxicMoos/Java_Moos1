package Lesson65.src.teacher_code;

import java.util.Arrays;

public class InsertingSort {
    public static void main(String[] args) {
        int[] arr = {100,55,68,2,0,-15,86,91,11,-30};
        System.out.print("--------Original Array--------- ");
        System.out.println();
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            int j = i-1;
            while (j>=0 && arr[j] > current){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.print("----------------------");
        System.out.println();
        System.out.println(Arrays.toString(arr));


    }
}
