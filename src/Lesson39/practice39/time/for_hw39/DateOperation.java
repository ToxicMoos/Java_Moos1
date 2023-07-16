package Lesson39.practice39.time.for_hw39;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
//    public static void main(String[] args) {
//        // Вычисление возраста на основе даты рождения
//        String birthDate1 = "1978-11-23";
//        String[] arr = {"1969-10-15","1982-07-12","1978-11-23"};// Массив дат
//
//
//        int age = getAge(birthDate1);
//        System.out.println("Your age is: "+age);
//
//       // Создание объектов LocalDate для трех композиторов
//        LocalDate mozart = LocalDate.of(1756,01,27);
//        LocalDate tchaikovsky = LocalDate.of(1840,05,07);
//        LocalDate beethoven = LocalDate.of(1770,12,17);
//
//        // Создание массива объектов LocalDate
//        LocalDate[] array = {tchaikovsky,mozart,beethoven};
//
//        // Преобразование массива LocalDate[] в массив строк String[]
//        String[] stringArray = new String[array.length];
//        for (int i = 0; i < array.length; i++) {
//            stringArray[i] = array[i].toString();
//        }
//
//        String[] sort =sortStringDates(stringArray);
//        for (int i = 0; i < sort.length; i++) {
//            System.out.println( sort[i]);
//
//        }
//
//    }
    // Метод для вычисления возраста
    public static int getAge(String birthDateStr) {
        LocalDate birthDate = LocalDate.parse(birthDateStr);            // Преобразование строки с датой рождения в объект LocalDate
        LocalDate currentDate = LocalDate.now();                        // Получение текущей даты

        long years = ChronoUnit.YEARS.between(birthDate, currentDate); // Рассчитываем разницу в годах между датой рождения и текущей датой
        return (int) years;                                            // Преобразование разницы в тип int и возвращение результата
    }


    // Метод для сортировки массива строк с датами
    public static String[] sortStringDates(String[] dates ){
        System.out.println("--------After sorting-----------");
        Arrays.sort(dates);// Сортировка массива строк
        Arrays.toString(dates);

        return dates; // Возвращение отсортированного массива строк


    }

}

