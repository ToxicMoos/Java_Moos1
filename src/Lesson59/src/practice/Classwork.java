package Lesson59.src.practice;

public class Classwork {

    public static void main(String[] args) throws InterruptedException {
        Classwork tasks = new Classwork();
//        tasks.task1();
//        tasks.task2();
//       tasks.task3();
//        tasks.task4();
        tasks.task5();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
        Thread.interrupted();
    }

    // Задача 1: Создание и старт двух потоков
    public void task1() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("New Tread 1");
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        thread2.start();
    }

    // Задача 2: Использование метода sleep()
    public void task2() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("New Tread 2");
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Задача 3: Установка и получение приоритета потока. создайте поток, установите для него максмально возможный
    // приоритет. Выведите на экран "Task 3: Thread Priority: ..."
    public void task3() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Task 3: Thread Priority: ..." + Thread.currentThread().getPriority());
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }

    // Задача 4: Использование join() для ожидания завершения потока. Создайте поток, который печатает числа от 1 до 5
    // с интервалом в 1с, главный поток должен дождаться выполнения этого потока
    public void task4() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread4 = new Thread();
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(thread4.getName() + " = " + i);
                }
            }
        });

        thread.start();
        thread.join();

        System.out.println("Task 4: Thread has finished execution");
    }

    // Задача 5: Использование потока-демона. Создайте демон-поток, который каждые 500 мс печатает в консоль
    // "Task 5: Daemon Thread is running", дайте поработать данному потоку 2 секунды, потом завршите выполнение
    // главного потока
    public void task5() throws InterruptedException {
        Thread daemonThread = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Task 5: Daemon Thread is running");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        // Позволим демону поработать 2 секунды перед завершением основного потока

        daemonThread.join(2000);
        System.out.println("Task 5: Main Thread is finishing and daemon will be terminated");
    }
}
