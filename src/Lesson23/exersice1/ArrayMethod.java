package Lesson23.exersice1;

//Задча 1. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей. Оформите решение данной задачи методами и напишите для них тесты.
public class ArrayMethod {
    //Methods
    //вывод на печать
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    //search of positive numbers
    public  int positiveNumbers(int[] arr) {
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                cout++;
            }
        }return cout;
    }

    public  int negativeNumbers(int[] arr) {
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                cout++;
            }
        }
        return cout ;
    }
    public  int eventNumbers(int[] arr) {
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                cout++;
            }
        }
        return cout ;
    }
    public   int zeroNubbers(int[] arr){
        int cout = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==0){
                cout=cout+1;
            }
        }
        return cout;
    }
}


