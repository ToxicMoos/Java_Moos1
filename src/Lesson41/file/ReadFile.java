package Lesson41.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myRead = new File("SheinFile.txt");
            Scanner myReader = new Scanner(myRead);//Создается объект класса Scanner с именем myReader, который будет использоваться для чтения содержимого файла, представленного объектом myObj.
            while (myReader.hasNextLine()) {// Этот блок while запускает цикл чтения файла построчно. Пока в файле есть следующая строка, цикл будет выполняться.
                String data = myReader.nextLine();//Внутри цикла, метод nextLine() объекта myReader считывает следующую строку из файла и сохраняет ее в переменную data.
                System.out.println(data);
            }
            myReader.close();//После того как цикл прочитал все строки из файла, вызывается метод close() у объекта myReader, чтобы закрыть поток чтения и освободить ресурсы
        } catch (FileNotFoundException ex) {//Если при попытке открыть файл для чтения происходит исключение типа FileNotFoundException, код в блоке catch выполнится.
            // В данном случае, будет выведено сообщение "An error occurred.", а затем будет выведена трассировка стека вызовов с информацией об исключении, сгенерированная методом printStackTrace().
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
