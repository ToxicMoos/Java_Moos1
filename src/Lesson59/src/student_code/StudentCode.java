package Lesson59.src.student_code;

public class StudentCode {
    public static void main(String[] args) throws InterruptedException {
        MyTread myTread = new MyTread();
        MyTread myTread1 = new MyTread();
        MyTread myTread2 = new MyTread();
        myTread.setName("Nice thread - 0");
        myTread1.setName("Nice thread - 1");
        myTread2.setName("Nice thread - 2");


        System.out.println(myTread.getName());
        myTread.start();
        Thread.sleep(1000);

        System.out.println("-------------------------");

        System.out.println(myTread1.getName());
        Thread.sleep(500);

        System.out.println("-------------------------");
        System.out.println(myTread2.getName());








    }
    static class MyTread extends Thread{
        public void run(){
            System.out.println("мой поток");
        }
    }
}
