package Lesson38.homeWork38;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Welcome to To_Do_List app!");
        ToDo_List[] menu = ToDo_List.values();

        System.out.println("Press 1: to    ADD(Add a note),\n" +
                "Press 2: to    VIEW_ALL( View all entries ),\n" +
                "Press 3: to    DELETE(Delete entry (by number) ),\n" +
                "Press 4: to    EXIT( Go out )");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Make your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println("Your choice is = " + menu[choice - 1].getToDo());
                    scan.nextLine(); // Очищаем буфер после считывания числа
                    System.out.print("Enter a note: ");
                    String note = scan.nextLine();
                    System.out.println("Note added: " + note);
                    break;
                }
                default: {
                    System.out.println("Wrong choice, try again");
                }
            }
        }
    }
}