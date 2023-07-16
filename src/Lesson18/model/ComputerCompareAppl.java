package Lesson18.model;

public class ComputerCompareAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5",32,5000,"Asus");
        Computer comp2 = new Computer("i5",32,5000,"Asus");
        System.out.println(comp1==comp2 );


    }
}
