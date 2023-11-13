package Lesson49.code.practice;

import java.util.LinkedList;

public class MyLinkedListAppl {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add("Sergey");
        list.add("Olja");
        list.add("Banana");

        System.out.println(list.indexOf("Olja"));


        for (String s : list) {
            System.out.println(list);
        }

    }
}
