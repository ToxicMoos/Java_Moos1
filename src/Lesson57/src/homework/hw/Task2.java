package Lesson57.src.homework.hw;



import java.io.*;

public class Task2 {
    public static void main(String[] args)  {
     String filePath ="C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson57\\src\\homework\\hw\\myFileXX";
     String word = " Hi all  ";

      try {
          FileWriter fileWriter = new FileWriter(filePath);
          fileWriter.write(word);
          fileWriter.close();
          System.out.println("Файл успешно создан и записан  .");
      } catch (IOException e) {
          throw new RuntimeException(e);
      }


    }
}
