package Lesson21.exercise3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//На столе лежат "n" монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
// Определите минимальное число монеток, которые нужно перевернуть,
// чтобы все монетки были повернуты вверх одной и той же стороной.
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number of coins : ");
        int size = scan.nextInt();
        int[] n = new int[size];

        int coinHeads=0;
        int coinTales=0;

        for(int coin :n){
            coin=random.nextInt(2); //генерируем два числа, либо 0, либо 1
            if (coin==1){
                coinHeads++;
            }else
                coinTales++;

            System.out.println(coin);//это просто для проверки
        }
        System.out.println("The number of heads coins is: "+ coinHeads);
        System.out.println("The number of tails coins is: "+ coinTales);
        System.out.println();
        int minCoin = Math.min(coinTales,coinHeads);
        if (minCoin==coinTales){
            System.out.println(" Minimum number of tales coins is: "+ minCoin);
        }else {
            System.out.println("Minimum number of head coins is: "+ minCoin);
        }
    }
}




