package Lesson46.practice.city_bus;

import java.util.Arrays;

public class Fun3 {
    public static void main(String[] args) {
        int[] arr = {9,15, 3  };//{9,15,-3,99,44,-10,77,60,0,21};
        int size =3 ;
        int capacity = 5;
        int temp = 1000;
        boolean isSorted = false;

        int[] newArr = new int[capacity];
        newArr = Arrays.copyOf(arr,capacity *2 );
        capacity = capacity *2;
        size++;





        for (int i : newArr) {
            System.out.print (i + " | ");
        }




//        while (!isSorted){
//            isSorted = true;
//
//            for (int i = 0; i < arr.length-1 ; i++) {
//                if (arr[i] > arr[i+1]){
//                    temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                    isSorted = false;
//                }
//            }
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//






    }
}
