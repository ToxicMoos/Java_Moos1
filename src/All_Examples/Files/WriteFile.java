package All_Examples.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter2 = new FileWriter("myFile2");
            Scanner scan = new Scanner(System.in);
            System.out.println("Input anything");
            fileWriter2.write(scan.nextLine());
            fileWriter2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileWriter fileWriter = new FileWriter("myFile1");
//            fileWriter.write("Salam vsem ");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
