package Lesson58.src.homework;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        MyTread1 myTread1 = new MyTread1();
        MyTread2 myTread2 = new MyTread2();

        myTread1.start();
        myTread2.start();

        try {
            myTread1.join();
            myTread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class MyTread1 extends Thread {
    @Override
    public void run() {
        File file = new File("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson58\\src\\homework\\file1.txt ");
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


class MyTread2 extends Thread {
    @Override
    public void run() {
        File file = new File("C:\\Users\\ToxicM\\IdeaProjects\\Java_Moos1\\src\\Lesson58\\src\\homework\\file2.txt");
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class myRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
