package Lesson17.pets;

import java.util.Random;


public class HouseAppl {
    public static void main(String[] args) {
        // Создайте класс Pet (домашние животные) с полями:
        //
        //тип (кошка, собака, ...)
        //вес
        //условия проживания (дома, на улице)
        //Создайте дочерние классы Cat и Dog c дополнительными полями: имя, порода, возраст.
        // Создайте метод eat, sleep для обоих классов и метод run (гулять) для класса Dog.
        // Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
        // Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.

        //создаем обьекты
        Dog dog1 = new Dog("Dog", "Pit Bull Terrier", "Rocky", 4, 25.500, " on the street");
        Dog dog2 = new Dog("Dog", "Pudel", "Sharik", 2, 10.700, " At home");
        Cat cat1 = new Cat("Cat", "British BKH", "Murzik", 3, 1.800, " on the street");
        Cat cat2 = new Cat("Cat", "Siam", "Barsik", 4, 2.700, " on the street");
        Cat cat3 = new Cat("Cat", "Bengal", "Mimi", 5, 3.500, " at home");
        //создаем массив с типом Pets[]  - полиморфизм позволяет
        Pets[] pets = {dog1, dog2, cat1, cat2, cat3};


        Random random = new Random();

        // Моделируем жизнь в течение дня

        System.out.println("День начался!");
        for (int i = 1; i <= 24; i++) {
            if (i == 6) {
                System.out.print("at " + i + ":00");
                dog1.voiceDog();
            } else if (i == 7) {
                System.out.print("at " + i + ":00");
                dog2.runDog();
            } else if (i == 8) {
                System.out.print("at " + i + ":00");
                dog1.eat();
            } else if (i == 9) {
                System.out.print("at " + i + ":00");
                cat1.voiceCat();
            } else if (i == 10) {
                System.out.print("at " + i + ":00");
                cat3.eat();
            }else if (i == 22) {
                System.out.print("at " + i + ":00");
                cat3.sleep();
                System.out.print("at " + i + ":00");
                dog1.sleep();
        }
    }}}