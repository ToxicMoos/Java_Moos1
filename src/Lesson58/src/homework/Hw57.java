package Lesson58.src.homework;

import javax.imageio.stream.ImageInputStream;

public class Hw57 {
    public static void main(String[] args) throws Exception {
       new MyThread().start();
       new MyThread().start();
       new MyThread().start();
       new MyThread().start();
       new MyThread().start();





        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread is:  " +Thread.currentThread().getName()+"- i "+i) ;

        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable: "+Thread.currentThread().getName());
    }
}



