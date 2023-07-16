package Lesson43.practice43.fun43.files43;

import All_Examples.Files.WriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

       readFile("myFile1.tt");




    }
    //methods
   static void createFile(String text){
        File file1 = new File(text );
        try {
            file1.createNewFile();
        }catch (IOException e){
        }
    }

   static void writeFile(String text){
       try {
           FileWriter fileWriter = new FileWriter(text);
           Scanner scan = new Scanner(System.in);
           System.out.println("Input your text in file: ");
           String inputText = scan.nextLine();
           fileWriter.write(inputText);
           fileWriter.close();
       } catch (IOException e) {
           System.out.println("Error");
           throw new RuntimeException(e);
       }
    }
    static void readFile(String path){
        File file = new File(path);
        try {
            Scanner scanReader = new Scanner(file);
            while (scanReader.hasNextLine()){//hasNextLine()возвращает true, если есть еще несчитанные строки
                String date = scanReader.nextLine();
                System.out.println(date);
            }scanReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error, no file");
            throw new RuntimeException("Error");
        }
    }


}
