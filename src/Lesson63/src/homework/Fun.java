package Lesson63.src.homework;

public class Fun {
    public static void main(String[] args) {
        //Оба эти метода выполняют преобразование целочисленного значения number в строку.
        // Результат будет храниться в переменных str1 и str2, и оба будут содержать строку "123".
        //Вы также можете использовать аналогичные методы для других примитивных типов данных, таких как double,
        // float, long и т.д. Например, для преобразования значения типа double в строку, вы можете использовать Double.toString() или String.valueOf().
        int number = 1978;
        String str = "23";

        String number1 = Integer.toString(number);
        int str1 =  Integer.parseInt(str);

        System.out.println("число - "+number1);
        System.out.println("строка - "+str1);
    }
}
