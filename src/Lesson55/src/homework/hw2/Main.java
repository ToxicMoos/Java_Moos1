package Lesson55.src.homework.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .sorted()
                .collect(Collectors.toList());
//                .filter(person -> person.getAge() > 30)
//                .sorted()
//                .map(p -> new Person(p.getFirstName(),"FUcker", p.getAge() ))
//                .collect(Collectors.toList());



//        for (Person person : persons2) {
//            System.out.println(person);
//        }

        persons2.forEach(s -> System.out.println(s));
    }
}
