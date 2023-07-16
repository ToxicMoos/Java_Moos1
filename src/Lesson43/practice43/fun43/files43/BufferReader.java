package Lesson43.practice43.fun43.files43;

import java.io.*;
import java.util.Scanner;

public class BufferReader {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = null;
//        try {
//            bf = new BufferedReader(new FileReader("SheinFile.txt"));
//            String line;
//            while((line = bf.readLine()) != null){
//                System.out.println(line);
//            }
//            bf.close();
//        } catch (IOException e) {
//            System.out.println("Error");
//        }

     bufferReader("star.txt");




        }
        static void bufferReader(String path){
            try {
                BufferedReader bf = new BufferedReader(new FileReader(path));
                String line;
                while ((line = bf.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error ,file is not exist");
            }

        }
         static void bufferWriter(String path){
             try {
                 BufferedWriter buffWriter = new BufferedWriter(new FileWriter("Star.txt"));
                 System.out.println("Input any text");
                 Scanner scan = new Scanner(System.in);
                 String text = scan.nextLine();
                 buffWriter.write(text);
                 buffWriter.close();


             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
    }

