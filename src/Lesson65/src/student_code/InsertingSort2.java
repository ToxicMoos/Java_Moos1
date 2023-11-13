package Lesson65.src.student_code;

import java.util.Arrays;

public class InsertingSort2 {
    public static void main(String[] args) {
        int[] arr = {100, 55, 68, 2, 0, -15, 86, 91, 11, -30};
        System.out.println("--------------Original------------------");
        System.out.println(Arrays.toString(arr ));
        System.out.println();
        System.out.println("--------------sorted------------------");



        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];

            int j = i-1;
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }


        System.out.println("--------------sorted------------------");
        System.out.println();
        System.out.println(Arrays.toString(arr ));
    }
}

