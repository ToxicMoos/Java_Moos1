package Lesson42.practice.try_catch;


import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {
        //деление на ноль
        //выход за пределы массива
        //Проверка ввода пользователя на корректность
/*
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input first number");
            int a = scan.nextInt();
            System.out.println("Input second number");
            int b = scan.nextInt();


            int division = a / b;
            System.out.println("Division " + a + "/" + b + " = " + division);
        }catch (Exception e){
            System.out.println("getMessage-"+e.getMessage()+", "+ "getCause-"+e.getCause()); //getMessage() - выводит сообщение
        }
*/
/*
        try {
            int[] arr = {5,-7,17,29,30};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[7]);
        }
        }catch (Exception e){
            System.out.println(e.getMessage()+" , "+e.toString());
        }
*/
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input first number");
            int a = scan.nextInt();
            System.out.println("Your input is; "+ a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
