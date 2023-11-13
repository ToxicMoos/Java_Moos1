package Lesson68.src.student_code;

import java.security.SecureRandom;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        int[] array = new int[10];

        fuck(array);
        print(array);





    }
    public static int[] fuck (int[] arr){
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < arr.length; i++) {
            int fuck = random.nextInt(10,20);
            arr[i] = fuck;
//            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print (i+" |");
        }
    }
}
