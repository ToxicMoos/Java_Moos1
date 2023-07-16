package Lesson19;

import java.util.Scanner;

public class Lesson19_1 {
    public static void main(String[] args) {
        // Написать метод, определяющий, является ли число простым (primary). Проcтое число - это число,
        //которое делится только на себя и 1. Примеры: 2, 7, 11, 19, 47.
        // Что на входе? - целое, положительное число int n.
        // Что на выходе? - boolean, ответ на поставленный вопрос
        // ключевой алгоритм: - перебрать все числа от 2 до (n -1) и проверить, разделилось ли число на любое из них
        // - если не произошло, тогда это число n - простое, иначе - оно НЕпростое.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int n = scan.nextInt();

        System.out.println("Your number is:"+n);
        isOrNotPrime(n);
    }
    public static int isOrNotPrime(int num) {

        boolean isPrime = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) { // если хотя бы раз разделилось, то
                isPrime = false;// объявим, что число НЕ простое и можно выйти из цикла
                System.out.println(num);
            }
        }
            if (isPrime) {
                System.out.println("Number " + num + " is prime.");
            } else {
                System.out.println("Number " + num + " is NOT prime.");
            }


        return num;
    }
}

