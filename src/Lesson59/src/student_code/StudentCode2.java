package Lesson59.src.student_code;

public class StudentCode2 {
    public static void main(String[] args) {
        Thread.currentThread().setName("Nice Thread - main");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Priority "+Thread.currentThread().getPriority());
        Thread thread = new Thread() {
            public void run() {

                Thread.currentThread().setName("New My name");

                System.out.println(Thread.currentThread().getName());


            }
        };
        thread.start();
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
    }
}


