package Lesson55.src.homework.hw2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Fun {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = input.stream()
                .filter(integer -> integer % 2 == 0)//Метод filter() в Java Stream API используется для фильтрации элементов в потоке на основе заданного условия. Он полезен, когда вы хотите выбрать только те элементы, которые удовлетворяют определенному критерию, и создать новый поток, содержащий только эти элементы.
                .collect(Collectors.toList());//Метод .collect(Collectors.toList()) используется для сбора элементов потока в список. Он преобразует элементы потока в коллекцию типа List.

        for (Integer integer : output) {
            System.out.print(integer + " ,");
        }
        System.out.println("\n-------------------------------------------------------");

        List<String> input1 = Arrays.asList("apple", "banana", "cherry");
        List<Integer> output1 = input1.stream()
                .map(String::length).collect(toList());//map() является одной из операций в Java Stream API и используется для преобразования каждого элемента потока в другой объект
//                .map(s -> s.length()).collect(Collectors.toList());//можно так писать

        for (Integer i : output1) {
            System.out.print(i + " , ");
        }

        System.out.println("\n--------------------------------------------");

        List<Integer> input2 = Arrays.asList(1, 2, 3, 4, 5);
        int count = (int) input2.stream().filter(s -> s % 2 == 0).count();

        System.out.println("чётных числа = "+count);
    }
}


