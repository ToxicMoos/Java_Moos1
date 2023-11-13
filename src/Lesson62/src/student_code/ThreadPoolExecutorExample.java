package Lesson62.src.student_code;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));

        executor.execute(() -> System.out.println("Task 1 is executed"));
        executor.execute(() -> System.out.println("Task 2 is executed"));
        executor.execute(() -> System.out.println("Task 3 is executed"));
        executor.execute(() -> System.out.println("Task 4 is executed"));
        executor.execute(() -> System.out.println("Task 5 is executed"));

        executor.shutdown();
    }
}
