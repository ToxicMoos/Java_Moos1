package Lesson22.exersice3;

import java.util.Scanner;

public class LengthMeasure {
    public static void main(String[] args) {
        //(switch case, бесконечный цикл, методы) Составьте программу для перевода мер длины:
        //саженей в метры (1 сажень равна 2,1366 м)
        //дюймов в сантиметры (1 дюйм равен 2,5 см)
        //футов в метры (1 фут равен 0,3048 м)
        //аршинов в метры (1 аршин равен 0,7112 м)
        //дюймов в миллиметры (1 дюйм равен 25,3995 мм)
        Scanner scan = new Scanner(System.in);

        while (true) {        //бесконечный цикл будет, пока пользователь не выйдет нажав 0
            System.out.println("Select the type of length measure conversion: ");
            System.out.println("1. Fathoms to meters");
            System.out.println("2. inches to centimeters");
            System.out.println("3. Feet to meters");
            System.out.println("4.Arches in meters");
            System.out.println("5. Inches to millimeters");
            System.out.println("0. Exit");

            int choice = scan .nextInt();

            System.out.print("Enter any value ");
            double value = scan .nextDouble();
            System.out.println();

            double convertedValue = convertor(choice, value);//проверяю на совпадение ,если...
            if (choice == 1 ||choice == 3 ||choice==4){
                System.out.println("Length conversion result: " + convertedValue + " meters");
                System.out.println();
            } else if (choice==2) {
                System.out.println("Length conversion result: " + convertedValue + " centimeters ");
                System.out.println();
            }else if (choice ==5){
                System.out.println("Length conversion result: " + convertedValue + " millimeters ");
                System.out.println();
            }if (choice == 0) {
                System.out.println("The program is finished, have a nice day");
                break;
            }
        }
    }
    public static double convertor(int choice, double value) {
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = value * 2.1366;
                break;
            case 2:
                convertedValue = value * 2.5;
                break;
            case 3:
                convertedValue = value * 0.3048;
                break;
            case 4:
                convertedValue = value * 0.7112;
                break;
            case 5:
                convertedValue = value * 25.3995;
                break;
            default:
                System.out.println("Wrong choice. Try again");
                System.out.println();
        }

        return convertedValue;
    }
}

