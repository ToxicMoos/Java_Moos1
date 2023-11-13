package Lesson54.src.student_code;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentCode2 {
    public static void main(String[] args) {
//        Queue<String >queue = new PriorityQueue<>();//сама сортирует по алфавиту
        Queue<String> queue = new ArrayDeque<>();//сохранит последовательность

        //метод add и offer очень похожи и выполняют одну и туже логику - добавляют элемент в конец очереди но,
        //если очередь ограничена размером,то метод add может привести к исключениям
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        System.out.println(queue);

        System.out.println(queue.size());//5
        System.out.println(queue.isEmpty());//
        System.out.println(queue.contains("five"));
        System.out.println(queue.contains("fiveZ"));

        queue.poll();//должен вернуть 1 элемент из очереди - аналог pop в стеке
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        System.out.println("queue.peek = "+ queue.peek());
        System.out.println(queue);

        System.out.println("queue.element = "+queue.element());
        System.out.println(queue);

        queue.clear();
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

     try {
         System.out.println(queue.element());
     }catch (NoSuchElementException e){
         System.out.println("Error----------------------------------");
     }
        System.out.println();

     //----------------------новая очередь-----------------------------------------
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

     //перебор
        for (String s : queue) {
            System.out.println(s+" ");
        }
        System.out.println();

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue);



    }
}
