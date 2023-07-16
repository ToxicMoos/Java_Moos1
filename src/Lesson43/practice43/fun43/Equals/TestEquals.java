package Lesson43.practice43.fun43.Equals;

import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12);
        Animal animal2 = new Animal(13);
        String str1 ="Hello";
        String str2 ="Hello";
        System.out.println(str1.equals(str2));



    }
}
class Animal{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;//down casting
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
