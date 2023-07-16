package Lesson42.consultation;

import java.util.Arrays;

public class ArraycopyTest {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (i + 1) * 10;
        }
        System.out.println(Arrays.toString(arrayInt));//печатвем массив

        //хотим вставить в массив новый элемент, например,15, сохранив при этом порядок сортировки
        //применим binarySearch для поиска места (индекс)
        int number =25;
        int index = Arrays.binarySearch(arrayInt,number);

//        if (index<0){
//            index=-index-1;
//        }else
//            index=index;
        index = index >=0 ? index : -index -1;//ternary operation

         System.out.println("index = " + index);
        System.out.println("---------------------------------------------------------");
        int[] newArr = new int[arrayInt.length+1];
        System.arraycopy(arrayInt,0,newArr,index  ,arrayInt.length);
        System.out.println(Arrays.toString(newArr));



    }
}
