package Lesson31.practic;

public class JsonWrapper2 < T > {
    private T value;
    //constructor

    public JsonWrapper2(T value) {
        this.value = value;
    }
    //getter

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return " {value=:"  + value +  '}';
    }
}
