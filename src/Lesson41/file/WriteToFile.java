package Lesson41.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("SheinFile.txt");
            fileWriter.write("Cohort 30, Hi to all!");
            fileWriter.close();
            System.out.println("Successfully wrote to the file");//Успешно записал в файл.
        }catch (IOException ex){
            System.out.println("An Error occurred");//произошел
            ex.printStackTrace();
        }
    }
}
