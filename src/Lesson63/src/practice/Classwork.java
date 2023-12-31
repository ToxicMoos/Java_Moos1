package Lesson63.src.practice;

import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Classwork {

    public static void main(String[] args) throws InterruptedException {
        Classwork cw = new Classwork();
//        cw.task1AtomicInteger();
//        cw.task2AtomicArray();
//        cw.task3CopyOnWriteArrayList();
 //       cw.task4ConcurrentHashMap();
        cw.task5BlockingQueue();
    }

    // Задача 1: Использование AtomicInteger для инкремента и декремента значения в многопоточной среде.
    void task1AtomicInteger() {
        AtomicInteger atomicInt = new AtomicInteger(0);

        // Создайте несколько потоков, которые будут инкрементировать и декрементировать значение atomicInt.
        // Убедитесь, что обновленное значение является правильным, после выполнения всех потоков.
    }

    // Задача 2: Использование AtomicReferenceArray для управления массивом объектов в многопоточной среде.
    void task2AtomicArray() {
        AtomicReferenceArray<String> atomicArray = new AtomicReferenceArray<>(10);

        // Создайте потоки, которые будут изменять различные индексы atomicArray и убедитесь, что чтение данных
        // происходит корректно.
    }

    // Задача 3: Использование CopyOnWriteArrayList для безопасной записи во время итерирования.
    void task3CopyOnWriteArrayList() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Придумайте сценарий, где несколько потоков читают и пишут в список одновременно.
    }

    // Задача 4: Использование ConcurrentHashMap для хранения и извлечения пар ключ-значение в многопоточной среде.
    void task4ConcurrentHashMap() throws InterruptedException {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();//ConcurrentHashMap - потоко-защищённое
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Поток 1");
                for (int i = 0; i < 1000; i++) {
                    String key = Thread.currentThread().getName()+" "+i;
                    String value = Thread.currentThread().getName();
                    map.put(key,value);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Поток 2");
                for (int i = 0; i < 1000; i++) {
                    String key = Thread.currentThread().getName()+" "+i;
                    String value = Thread.currentThread().getName();
                    map.put(key,value);
                }
            }
        });

        //  Создайте сценарий, где несколько потоков добавляют, удаляют и читают пары ключ-значение одновременно,
        // не используя явные блокировки.
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(map.size());
    }

    // Задача 5: Использование BlockingQueue для потокобезопасного добавления и извлечения объектов.
    void task5BlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Producer");
                for (int i = 0; i < 10; i++) {
                    queue.add(Thread.currentThread().getName()+"-"+i);
                    try {
                        Thread.sleep(new Random().nextInt(500,2000));//рандомный слип
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // Создайте производителя, который помещает объекты в очередь, и потребителя, который извлекает объекты из
        // очереди. Убедитесь, что потребитель может консумировать объекты правильно, даже если производитель добавляет их в
        // произвольные моменты времени.

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Consumer");
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(queue.take());
                        if ( queue.isEmpty()){
                            Thread.sleep(2000);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
