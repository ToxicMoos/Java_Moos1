package homeWork19;

import java.util.Scanner;

public class Lesson19_2 {
    public static void main(String[] args) {
        // (на повторение темы массивы, циклы и вычисления) Вводится пользователем натуральное число n. Сформировать массив из всех делителей данного числа.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any natural number: ");
        int n =scan.nextInt();
        // Определяем размер массива делителей
        int countDivisors =0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                countDivisors++;
            }
        }
        // создаем массив делителей
        int[] arrayDivisors = new int[countDivisors];
        int index=0;       //сюда будем записывать делители
        for (int i = 1; i <= n ; i++) {
            if (n%i==0){ //  Если условие выполняется, то i является делителем числа n.
                arrayDivisors[index]=i;  //  записываем его в текущую позицию массива arrayDivisor
                index++;
            }
        }

        System.out.println("Array of number divisors " + n + ":");
        for (int nums : arrayDivisors) {
            System.out.print(nums + " ");
    }
}}

