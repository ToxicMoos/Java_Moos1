package Lesson57.src.practice.stream;

import java.io.*;
import java.util.Scanner;

public class IOExamples {

    public static void main(String[] args) {
//        readBytesFromFile();
//        writeBytesToFile();
//        readTextFromFile();
        writeTextToFile();
//        readFromConsole();

        File file = new File("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\practice\\stream\\input.txt");

        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }


    // Метод для чтения байт из файла с использованием FileInputStream
    public static void readBytesFromFile() {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\practice\\stream\\input.txt")) {
            int data;
            // Чтение байт из файла до тех пор, пока не достигнут конец файла (-1)
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // Преобразование байта в символ и вывод на консоль
            }
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для записи байт в файл с использованием FileOutputStream
    public static void writeBytesToFile() {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\practice\\stream\\input.txt")) {
            String message = "Hello, S world!";
            fos.write(message.getBytes());  // Преобразование строки в массив байт и запись в файл
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для чтения текста из файла с использованием BufferedReader и FileReader
    public static void readTextFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\practice\\stream\\input.txt"))) {
            String line;
            // Чтение строк из файла до тех пор, пока не достигнут конец файла (null)
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Вывод строки на консоль
            }
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для записи текста в файл с использованием BufferedWriter и FileWriter
    public static void writeTextToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\practice\\stream\\input.txt"))) {
            bw.write("Hello, Fu world!");  // Запись строки в файл
        } catch (IOException e) {
            e.printStackTrace();  // Обработка исключений ввода/вывода
        }
    }

    // Метод для чтения данных из консоли с использованием System.in и Scanner
    public static void readFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  // Чтение строки из консоли
            System.out.println("Hello, " + name + "!");
        }
    }
}

