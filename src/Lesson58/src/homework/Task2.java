package Lesson58.src.homework;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        // Создаем объекты MyThread1 и MyThread2
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // Запускаем потоки
        myThread1.start();
        myThread2.start();

        // Ждем завершения обоих потоков
        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим результат из 2 фвйлов на печать
        System.out.println(myThread1.getStringBuilder().toString() + myThread2.getStringBuilder().toString());
    }
}

//----------------------------MyThread1------------------------------------------
class MyThread1 extends Thread {
    // Объявляем StringBuilder для хранения данных из файла
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void run() {
        // Создаем объект File, представляющий путь файлу, который мы хотим прочитать
        File file = new File("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson58\\src\\homework\\file1.txt");
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));//// Создаем BufferedReader для эффективного чтения файла
            String line;
            // Читаем файл построчно
            while ((line = buffer.readLine()) != null) {
                // Синхронизируем доступ к stringBuilder и добавляем данные из файла
                synchronized (stringBuilder) {
                    stringBuilder.append(line).append(" ");// Добавляем текущую строку и пробел к stringBuilder
                }
            }
        } catch (FileNotFoundException e) {
            // Если файл не найден, выбрасываем RuntimeException с информацией об ошибке
            throw new RuntimeException(e);
        } catch (IOException e) {
            // Если возникает ошибка ввода-вывода при чтении файла, выбрасываем RuntimeException с информацией об ошибке
            throw new RuntimeException(e);
        }
    }

    // Метод для получения элемента stringBuilder
    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}
//--------------------------------MyThread2---------------------------------------------

class MyThread2 extends Thread {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void run() {
        File file = new File("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson58\\src\\homework\\file2.txt");
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                synchronized (stringBuilder) {
                    stringBuilder.append(line).append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Метод для получения stringBuilder
    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}
