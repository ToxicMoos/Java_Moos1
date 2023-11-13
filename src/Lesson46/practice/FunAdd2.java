package Lesson46.practice;

import java.util.Arrays;

public class FunAdd2 {
    public static void main(String[] args) {
        int[] arr = {55,12,2,0,67,-3,28,-15};
        int num = 5;
        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr,num);
//        if (index < 0){
//            index = -index -1;
//        }else {
//            index = index;
//        }
        index = index < 0 ? - index -1 : index;
        System.out.println("index = "+index);
        int[] newArr = new int[arr.length + 1 ];
        System.arraycopy(arr,0,newArr,0,index  );
        System.arraycopy(arr,index,newArr,index+1,arr.length - index);
        newArr[index]= num;

//        for (int j = 0; j < arr.length-1; j++) {
//            for (int i = 0; i < arr.length -1; i++) {
//            if(arr[i] > arr[i +1] ){
//                int temp = arr[i] ;
//                arr[i] = arr[i +1];
//                arr[i +1] = temp;
//            }
//
//        }
//
//        for (int i : arr) {
//            System.out.print(i +" | ");
//        }
//
//    }





        for (int i : arr) {
            System.out.print( i + " | ");
        }

        System.out.println();

        for (int i : newArr) {
            System.out.print ( i + " | ");
        }

    }
}
