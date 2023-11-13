package Lesson49.fun49;

public class Node49 {
    private String data;
    private Node49 prev;
    private Node49 next;

    public Node49(String data, Node49 prev, Node49 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    //get - setters

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node49 getPrev() {
        return prev;
    }

    public void setPrev(Node49 prev) {
        this.prev = prev;
    }

    public Node49 getNext() {
        return next;
    }

    public void setNext(Node49 next) {
        this.next = next;
    }
}
