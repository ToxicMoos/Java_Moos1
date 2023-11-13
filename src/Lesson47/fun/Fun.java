package Lesson47.fun;

import java.util.Arrays;

public class Fun {
    public static void main(String[] args) {
        int[] array ={3,9,1,5,8,-3,2,6,10,0,4,-15};
        int number = 6;
        Arrays.sort(array);

        int[] newArr = new int[array.length -1 ];
        int x = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number){
                newArr[x] = array[i];
                x++;
            }

        }

//        int[] newArr = new int[array.length-1];
//        int newNum  = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != number){
//                newArr[newNum] = array[i];
//                newNum++;
//
//            }
//        }








        for (int i : array) {
            System.out.print (i +" | ");
        }

        System.out.println();
        for (int i : newArr) {
            System.out.print (i +" | ");
        }

    }
}
