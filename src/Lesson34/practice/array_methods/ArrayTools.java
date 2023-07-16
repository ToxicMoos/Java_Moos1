package Lesson34.practice.array_methods;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    //печать массива
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------------------------");
    }


    //поиск объекта в массиве объекта
    public static int searchIndex(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;      //вернул индекс i
            }
        }
        return -1; //вернул несуществующий индекс -1
    }


    ////поиск объекта в массиве объекта возвращает boolean
    public static boolean searchBoolean(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;      //вернул true
            }
        }
        return false; //вернул false
    }

    //поиск объекта по условию
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) { //метод возвращает тип Т, из массива типа Т[],отбор по предикату
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {//тест - встроенный в класс Predicate метод,возвращает boolean -тест прошёл или нет
                return arr[i];
            }
        }
        return null;
    }

    //bobbleSort
    public static <T extends Comparable<T>> void bubbleSort(T[] arr, Comparator<T> comparator){//этот метод применим к типам(классам) в которых есть наследование интерфейса Comparable<T>
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length -1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0){//результат двух соседних элементов больше нуля
                    //перестановка элемента массива местами
                    T t = arr[j];//уберегли j-й элемент от затирания, убрав его во временную переменную
                    arr[j] = arr[j+1];//j+1 - элемент перенесли в j-й
                    arr[j+1] = t; //в j+1 - элемент поставили t
                }
            }

        }

    }
}
