package Lesson44.complexity;

import java.util.Arrays;

public class Complexity {
    public static void main(String[] args) {
        int[] arr = {5,7,11,2,3,13};

        double mid = arr[0] + arr[arr.length-1] / 2;
        //вычисление среднего массива
        //кол-во действий
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];

        }
//поиск элемента с помощью binarySearch

        int index = Arrays.binarySearch(arr,2);

        if (index<0){
            index = -index -1;
        }else {
            index = index;
        }

        System.out.println(index );

        //сортировка массива bubble sort

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j]= arr[j+1];//меняем местами
                    arr[j+1] = t;
                }
            }
        }

        Arrays.sort(arr);
        for (int x:arr) {
            System.out.println(x);

        }

    }
}
