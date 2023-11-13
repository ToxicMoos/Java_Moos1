package Lesson62.src.student_code;

import java.util.concurrent.Executor;

public class ExecutorExample {
    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();

        executor.execute(() -> System.out.println(Thread.currentThread().getId()+" Task is executed asynchronously by Executor!"+Thread.currentThread().getPriority()));
        executor.execute(() -> System.out.println(Thread.currentThread().getId()+ " Second Task  !"));

        System.out.println(Thread.currentThread().getId()+" finish");
    }
}
