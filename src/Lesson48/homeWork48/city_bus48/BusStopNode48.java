package Lesson48.homeWork48.city_bus48;

public class BusStopNode48 {
    //fields
     String stopName;
     BusStopNode48 next;
     BusStopNode48 prev;

    //constructor

    public BusStopNode48(String stopName) {
        this.stopName = stopName;
        this.next = null;
        this.prev = null;
    }


    //getters and setters


    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public BusStopNode48 getNext() {
        return next;
    }

    public void setNext(BusStopNode48 next) {
        this.next = next;
    }

    public BusStopNode48 getPrev() {
        return prev;
    }

    public void setPrev(BusStopNode48 prev) {
        this.prev = prev;
    }
}
