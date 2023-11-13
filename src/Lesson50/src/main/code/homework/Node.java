package Lesson50.src.main.code.homework;

public class Node {
    //fields
    private String date;
    private Node prev;

    private Node next;


    //constructor

    public Node(String date, Node prev, Node next) {
        this.date = date;
        this.prev = prev;
        this.next = next;
    }


    //getters

    public String getDate() {
        return date;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}
