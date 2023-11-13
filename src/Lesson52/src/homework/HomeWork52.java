package Lesson52.src.homework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HomeWork52 {
    public static void main(String[] args) {
        Map<String, LocalDate> birthdays = new HashMap<>();

        LocalDate schwarzenegger  = LocalDate.of(1947,7,30);
        LocalDate stallone = LocalDate.of(1946 ,3,6);
        LocalDate bruceWillis = LocalDate.of(1955,4,19);
        LocalDate keanuReeves = LocalDate.of(1964,9,2);
        LocalDate tomCruise = LocalDate.of(1962,5,3);

        birthdays.put("ARNI",schwarzenegger);//add
        birthdays.put("RAMBO",stallone);
        birthdays.put("WILL",bruceWillis);
        birthdays.put("NEO",keanuReeves);
        birthdays.put("Jack",tomCruise);

        System.out.println(birthdays.get("ARN "));//get
        System.out.println(birthdays.get("RAMBO"));

        birthdays.remove("ARN" );
        System.out.println("ARN , schwarzenegger = "+birthdays.get("ARN"));//remove

        System.out.println("Key WILL = "+birthdays.containsKey("WILL"));  //boolean containsKey  = true
        System.out.println("Key HELLO = "+birthdays.containsKey("HELLO"));  //boolean containsKey = false

        System.out.println("Value tomCruise = "+birthdays.containsValue(tomCruise));//boolean containsValue  = true

        System.out.println(birthdays.keySet());//вывод ключей на экран

        birthdays.values().forEach(i -> System.out.println(i));
        System.out.println("-----------------------------------------");

        for (Map.Entry<String,LocalDate> entry : birthdays.entrySet()){//forEach
//            System.out.println(entry.getKey() + ": " + entry.getValue());
            birthdays.remove(entry);

        }





    }
}
