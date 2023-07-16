package Lesson17.pets;

public class Cat extends Pets {
    //Создайте дочерние классы Cat и Dog c дополнительными полями: имя, порода, возраст.
    // Создайте метод eat, sleep для обоих классов и метод run (гулять) для класса Dog.
    // Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.


    public Cat(String type, String breed, String name, int age, double weight, String accommodations) {
        super(type, breed, name, age, weight, accommodations);
    }

    public void voiceCat(){
        System.out.println(" " +type+" "+ name+" says - Meow! ");

    }



}
