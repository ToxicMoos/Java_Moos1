package Lesson48.homeWork48.city_bus48;

public class CircularRoute48 {
    //field
    private BusStopNode48 head;
    private int size;
    //constructor


    public CircularRoute48( ) {
        this.head = null;
        this.size = 0;
    }

    //methods

    void addStop(String stopName){
        BusStopNode48 newNod = new BusStopNode48(stopName);
        if (head == null){
           head = newNod;
           head.next = head;//loop
        }else {
            BusStopNode48 temp = head;
            while (temp.next != head ){
                temp = temp.next;
            }
            temp.next = newNod;
            newNod.next = head;
        }
        size++;
    }
    //to string


    @Override
    public String toString() {
        return "CircularRoute48 = {" + "head=" + head + '}';
    }
}


