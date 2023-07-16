package Lesson27.exersice2;

import java.util.Random;

public class Array {

//Поиск дубликатов в массиве. Задумайте массив из 100 элементов и заполните его случайными значениями целых чисел в интервале от 1 до 10.
// Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.

    public static void main(String[] args) {

            int[] arrays = new int[10];


            // Заполнение массива случайными значениями от 1 до 10
            for (int i = 0; i < arrays.length; i++) {
                Random random = new Random();
                arrays[i] = random.nextInt(1, 10 + 1);

            }
//           displayDuplicate(arrays);


        }
//        public static void   displayDuplicate (int [] array){
//            // Подсчет повторений элементов
//            int[] counts = new int[11]; // Массив для хранения количества повторений элементов (индекс 0 не используется)
//
//            for (int num : array) {
//                counts[num]++;
//                System.out.print ( num+",");
//            }
//            printArray(counts);

//    }
        // метод вывод на печать
        public static void printArray(int[] counts){
            System.out.println("\nElements that occur more than once:");
            for (int i = 1; i <= 10; i++) {
                if (counts[i] > 1) {//проверяем counts[i] > 1, чтобы найти элементы, которые встречаются более одного раза
                    System.out.println("Element " + i + " met  " + counts[i] + "  times");
                }
            }
    }
}


