package Lesson58.src.student_code;

public class StudentCode {
    public static void main(String[] args) {
//создаем два разных экземпляра класса MyThread
//вся основная логика заключается в методе run()
    MyThread myThread1 = new MyThread();
    MyThread myThread2 = new MyThread();

//в случае если мы запустим выполнение потоков при помощи метода run(), то выполнение будет находится
//
//    myThread1.start();
//    myThread2.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Runnable + "+ i);
                }try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        myThread1.start();
        myThread2.start();
        r.run();

        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Runnable + "+ i);
                }try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread1.start();
        thread2.start();

    }
    static class MyThread extends Thread{
        public void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println("MyThread +" +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
