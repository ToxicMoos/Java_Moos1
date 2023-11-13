package Lesson57.src.homework.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)//создает поток целых чисел в указанном диапазоне
                .boxed()//преобразует этот поток в поток объектов Integer
                .collect(Collectors.toList());//собирает числа в список numbers.

        List<Integer> evenNum = numbers.stream()
                .filter(num -> num % 2 == 0)//фильтруем на чётные числа
                .map(num -> num * 2)//и умножаем на 2
                .collect(Collectors.toList());//используется для сбора элементов из потока в коллекцию или другую структуру данных

        System.out.println(evenNum);
    }
}


