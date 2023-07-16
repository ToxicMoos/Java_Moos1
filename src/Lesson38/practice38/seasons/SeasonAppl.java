package Lesson38.practice38.seasons;

import Lesson38.practice38.month.Month;

public class SeasonAppl {
    public static void main(String[] args) {

        Season season = Season.SUMMER;
        Month month = Month.NOV;
        System.out.println(Season.SPRING);
        System.out.println(season.name());
        System.out.println("------------Value-----------------");
        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);

        }

        System.out.println("------------Original--------------");
        System.out.println(season.name());
        System.out.println(season.ordinal());//ordinal() - порядковый номер в списке enum
        System.out.println(season.SPRING.ordinal());//
        System.out.println(season.AUTUMN.ordinal());



    }
}
