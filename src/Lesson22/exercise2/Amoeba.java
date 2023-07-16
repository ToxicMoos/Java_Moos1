package Lesson22.exercise2;

import java.util.Scanner;

public class Amoeba {
    public static void main(String[] args) {
        //(цикл) Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        // Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        int time = scan.nextInt();
        System.out.println("The numbers of Amoebas in "+ time +" hours is:  "+ amoebaCount(time/3));

    }
    public static long amoebaCount(int n){
        long amoeba = 1;
        for (int i = 1; i <= n ; i++) {
            amoeba *= 2;
            System.out.println(amoeba);
        }
        return amoeba;
    }
}

