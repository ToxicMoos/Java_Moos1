package Lesson54.src.student_code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentCode {
    public static void main(String[] args) {
//        Queue queue = new LinkedList();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);

        for (Integer integer : stack) {
            System.out.print(integer+" ");
        }
        System.out.println();
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println();
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);//всё удалили
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.contains(7));
//        System.out.println(stack.contains(70));
//        System.out.println(stack.search(3));//search-возвращает количество вызовов метода pop
//        System.out.println(stack.pop());//pop-возвращает элемент из stack, удаляя его из stack
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());//peek - возвращает элемент c вершины stack, не удаляя его из stack
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        stack.clear();
//        System.out.println(stack.isEmpty());


    }
}
