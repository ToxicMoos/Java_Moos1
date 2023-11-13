package Lesson52.src.teacher_code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;

public class TeacherCode {
    public static void main(String[] args) {
        LocalDate date1978 = LocalDate.of(1978,11,23);
        LocalDate dateNow = LocalDate.now();

        LocalDate date1 = date1978.with(ChronoField.YEAR,2050);
        LocalDate date2 = date1978.withMonth(12);
        LocalDate date3 = date1978.withYear(3074).withMonth(3).withDayOfMonth(17);

        boolean after = date1978.isAfter(dateNow);
        boolean before = date1978.isBefore(dateNow);
        boolean equals = date1978.equals(dateNow);
        boolean leapYear= date1978.isLeapYear();



        int year = dateNow.getYear();
        String month = dateNow.getMonth().name();
        int day = dateNow.getDayOfMonth();
        int dayYear = dateNow.getDayOfYear();

        System.out.println(day);

        DayOfWeek dayOfWeek = dateNow.getDayOfWeek();


        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);






    }
}
