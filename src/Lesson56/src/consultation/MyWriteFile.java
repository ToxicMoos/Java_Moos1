package Lesson56.src.consultation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriteFile {
    public static void main(String[] args) {
        // Укажите путь и имя файла, который вы хотите создать и записать
        String fileName = "example.txt";

        try {
            // Создайте экземпляр класса File
            File file = new File(fileName);

            // Создайте экземпляр класса FileWriter для записи в файл
            FileWriter writer = new FileWriter(file);

            // Текст, который вы хотите записать в файл
            String textToWrite = "Hello, World!\nThis is a test.";

            // Запишите текст в файл
            writer.write(textToWrite);

            // Закройте FileWriter
            writer.close();

            System.out.println("Файл успешно создан и записан: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
