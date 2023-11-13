package Lesson62.src.homework;

import java.util.Random;
import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        inputOfCount();
        randomOfCounts();
    }

    static int m = 0;
    public static void inputOfCount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите колличество элементов в массиве: ");
        m = scanner.nextInt();
    }
    public static void randomOfCounts() {
        int[] arr = new int[m];// Создание массива arr с размером m.

        Random random = new Random();

//        int min = 1;
//        int max = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100 - 1);// Заполнение массива случайными числами от 0 до 99.
        }

        System.out.println("Исходный массив: ");

        for (int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] sortedArray = mySort(arr);// Сортировка массива arr в порядке убывания.

        System.out.println("Отсортированный массив в порядке убывания:");
        for (int i = 0; i < m; i++) {
            System.out.print(sortedArray[i] + " "); // Вывод отсортированного массива на экран.
        }
        System.out.println();
    }


    public static int[] mySort(int[] arr) {
        for (int i = 0; i < m - 1; i++) {// Внешний цикл,выполняется m - 1 раз, где m представляет длину массива arr. В каждой итерации этого цикла сравниваются и перемещаются наибольшие элементы в конец массива
            for (int j = 0; j < m - 1 - i; j++) {// Внутренний цикл,выполняется внутри внешнего цикла и также зависит от переменной m и текущей итерации внешнего цикла i. Этот цикл проходит через элементы массива и сравнивает их с соседними элементами.
                if (arr[j] < arr[j + 1]) {// Проверка условия,проверяет, больше ли текущий элемент arr[j] следующего элемента arr[j + 1]. Если это условие выполняется, то выполняется обмен значений элементов, чтобы поменять их местами.
                    int tempNumber = arr[j];// Создание временной переменной для хранения значения arr[j]
                    arr[j] = arr[j + 1];// Присваивание arr[j] значению arr[j + 1].
                    arr[j + 1] = tempNumber;// Присваивание arr[j + 1] значению временной переменной.
                }
            }
        }
        return arr;
    }
}
