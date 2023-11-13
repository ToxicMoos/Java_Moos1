package Lesson47.fun;

import java.util.Arrays;

public class FunRemove {
    public static void main(String[] args) {

        int[] arr = {7,3,9,1,5,2 ,4,10,8,6};
        int num = 5;



//        Arrays.sort(arr);
//        int[] newArr = new int[size-1];
//        int newNum = 0;
//
//
//        for (int i = 0; i < size; i++) {
//           if (arr[i] != num){
//               newArr[newNum] = arr[i];
//               newNum++;
//
//
//           }
//        }
        Arrays.sort(arr);

        int x =0;
        int[] newArr = new int[arr.length  ];

        for (int i = 0; i < arr.length  ; i++) {
            if (arr[i] != num ){
              newArr[x] = arr[i];
              x++;
            }

        }






        for (int i : arr) {
            System.out.print(i + " | ");
        }

        System.out.println();

        for (int i : newArr) {
            System.out.print (i + " | ");
        }




    }
}
