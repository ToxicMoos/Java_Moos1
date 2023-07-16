package Lesson31.practic;

public class JsonWrapper1 {
    //field
    private Object value;
    //constructor

    public JsonWrapper1(Object value) {
        this.value = value;
    }
    //getter

    public Object getValue() {
        return value;
    }
//toString
    @Override
    public String toString() {
        return "{ value: " + value + '}';
    }
}
