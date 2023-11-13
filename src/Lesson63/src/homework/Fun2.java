package Lesson63.src.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

public class Fun2 {
    public static void main(String[] args) throws InterruptedException {




        thread1.start();


    }

    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {

            for (int i = 0; i < 3; i++) {
                Thread.currentThread().setName("Rambo  поток");
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Поток 1 был прерван.");
                }
            }
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {

           while (!Thread.interrupted()){
               System.out.println("Thread 2");
           }
            System.out.println("Thread 2 завершает работу после прерывания Thread 1.");
        }
    });

}