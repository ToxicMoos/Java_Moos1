package Lesson35.hw1_Cats.cats;

import java.util.Objects;

public class Cat implements Comparable <Cat> {
    //пример с классом Cat
    //Создать класс Cat, 4 поля
    // стандартные конструктор, геттеры и сеттеры
    // toString equals- переопределить
    // Создать класс для тестирования
    // создать массив с представителями класса
    // добавить интерфейс comparable в класс Cat, переопределить метод compareTo
    // отсортировать массив кошек
    //поля
    private String name;//кличка
    private int age;//возраст
    private String color;
    private double weight;
    //constructor


    public Cat(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //toSting
    @Override
    public String toString() {
        return "Cat{" + "name = '" + name +", age = " + age + ", color = '" + color + ", weight = " + weight + '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//что он не нулевой
        if (o == null || getClass() != o.getClass()) return false;//он в классе Cat
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);//он равен по:age,weight,name,color
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, weight);
    }
//method CompareTo

//    @Override
//    public int compareTo(Cat o){
//        //по имени и по возрасту
//        int res1 = this.name.compareTo(o.name);//отвечает за имя
//        int res2 = this.age-o.age;//отвечает за возраст
//        int res = 0;
//        if (res1<=0 && res2<=0){
//            res = -1;
//        }else {
//            res = 1;
//        }
//        return res ;
//    }
//    @Override
//    public int compareTo(Cat o) {
//        //сортируем по возрасту
////         return o.age-this.age;//сравнение по возрасту, если результат отрицательный, то порядок останется,если положительный, то объекты поменяют местами
////        return this.age-o.age;
//         return this.name.compareTo(o.name);//сравнение двух строк по порядку
////        return - this.name.compareTo(o.name); //ставим впереди минус, сортируем в обратном порядке
//    }

    @Override
    public int compareTo(Cat o) {
       // return Integer.compare(this.getAge(),o.getAge());//сортируем по годам через метод Integer.compare
        return this.age-o.age;

    }
}
