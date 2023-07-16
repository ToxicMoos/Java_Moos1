package Lesson33.practice.array_methods;

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
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }
}
