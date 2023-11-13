package Lesson50.src.main.code.teacher_sandbox;

import Lesson50.src.main.code.practice.House;

import java.util.HashSet;

public class TeacherClasswork {
    public static void main(String[] args) {
        House h1 = new House(1, "123", 50);
        House h2 = new House(2, "345", 50);
        House h3 = new House(3, "852", 100);
        House h4 = new House(4, "711", 90);


        HashSet<House> set1 = new HashSet<>();
        HashSet<House> set2 = new HashSet<>();

        set1.add(h1);
        set1.add(h2);
        set2.add(h3);
        set2.add(h4);

        HashSet<House> mySet = new HashSet<>();

        set1.forEach( i-> System.out.println(i));
        set1.forEach( i->mySet.add(i));



//        set1.forEach(i -> System.out.println(i));
//        System.out.println(h1.equals(h2));
//        System.out.println("h1.hashCode = "+h1.hashCode());
//        System.out.println("h2.hashCode = "+h2.hashCode());
    }


}
