package Lesson51.src.teacher_sandbox;

public class MyLinkedList2<T> {
    private Node<T> head;
    private int size;


    private static class Node<T> {
        T data;
        Node<T> next;


        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public    int   size(int size){
        return size;
    }

    public static void main(String[] args) {
        MyLinkedList2<Integer> myLinkedList2 = new MyLinkedList2<>();
        myLinkedList2.add(1);
        myLinkedList2.add(2);
        myLinkedList2.add(3);

        

        
            
        }
    }
 




