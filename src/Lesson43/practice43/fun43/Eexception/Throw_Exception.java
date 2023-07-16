package Lesson43.practice43.fun43.Eexception;

import java.io.IOException;
import java.util.Scanner;

public class Throw_Exception {
    public static void main(String[] args)   {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number");

        while (true){
            int x = Integer.parseInt(scan.nextLine());
            if (x !=0 ){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("wrong number, try agan");;
                }
            }
        }


    }
}

