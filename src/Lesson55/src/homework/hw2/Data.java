package Lesson55.src.homework.hw2;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Киану","Ривз",61);
        Person person2 = new Person("Арнольд","Шварценегер",72);
        Person person3 = new Person("Том","Круз",53);
        Person person4 = new Person("Джони ","Деп",42);
        Person person5 = new Person("Анджелина","Джоли",35);
        Person person6 = new Person("Бен","Гур",33);
        Person person7 = new Person("Вин","Дизель",51);
        Person person8 = new Person("Грег","Томсон",22);
        Person person9 = new Person("Натали","Портман",42);
        Person person10 = new Person("Олаф","Шольтц",60);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }

    public static List<Person> getPersons(){
        return persons;
    }




}
