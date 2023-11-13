package Lesson47.practice;

import java.util.Arrays;

public class Practice {
    private int[] array;
    private int size;
    private int capacity;

    public Practice(int x) {
        array = new int[x];
        this.capacity = x;
        this.size = 0;
    }


    public  void add(int n){
        int[] temp = new int[capacity * 2];
        temp = Arrays.copyOf(array,capacity*2);
    }

    

}
