package homeWork20.randomArray;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        // Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
        // Подсчитайте, сколько в этом массиве оказалось:
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(21)-10;//генерирует случайное число от 0 до 20 и вычитает 10, чтобы получить числа в диапазоне от -10 до 10.
            System.out.println(array[i]);
        }
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int number :array){
            if (number>0){
                countPositive++;
            } else if (number<0) {
                countNegative++;
            }else countZero++;
        }
        System.out.println("Amount of positive numbers is:"+countPositive);
        System.out.println("Amount of negative numbers is:"+countPositive);
        System.out.println("Amount of zero numbers is:"+countZero);
    }
}
