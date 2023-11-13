package Lesson62.src.student_code;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10_000);  // Imitating some work
            return "Task's result";
        });

        try {
            System.out.println("Waiting for the task to complete...");
            while (!future.isDone()){
                Thread.sleep(500);
                System.out.println("Steel waiting");
            }
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
