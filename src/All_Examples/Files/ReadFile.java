package All_Examples.Files;

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
       File file = new File("myFile.tx t");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String date = sc.nextLine();
                System.out.println(date);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

    }
}
// This is a new commit attempt from the terminal
// This is a new commit attempt from the terminal
// This is a new commit attempt from the terminal
// This is a new commit attempt from the terminal

