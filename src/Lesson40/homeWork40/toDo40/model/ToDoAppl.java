package Lesson40.homeWork40.toDo40.model;


public class ToDoAppl {
    public static void main(String[] args) {
        int[] v = {1,2,3,-1,99,168};
        int[] f = {1,2,3,-1,99,168,1,2,3,-1,99,168};

    ar(f);


    }
    static void ar(int  ...array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
