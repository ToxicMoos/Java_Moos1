package Lesson52.src.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork52Test {
    Map<String, LocalDate> birthdays;
    private LocalDate schwarzenegger;
    private LocalDate stallone;
    private LocalDate bruceWillis;
    private LocalDate keanuReeves;
    private LocalDate tomCruise;
    @BeforeEach
    void setUp() {
        birthdays = new HashMap<>();

        schwarzenegger  = LocalDate.of(1947,7,30);
        stallone = LocalDate.of(1946 ,3,6);
        bruceWillis = LocalDate.of(1955,4,19);
        keanuReeves = LocalDate.of(1964,9,2);
        tomCruise = LocalDate.of(1962,5,3);

        birthdays.put("ARNI",schwarzenegger);//add
        birthdays.put("RAMBO",stallone);
        birthdays.put("WILL",bruceWillis);
        birthdays.put("NEO",keanuReeves);
        birthdays.put("Jack",tomCruise);
    }
    @Test
    void addBirthDayTest(){
        LocalDate birthDayTest = LocalDate.of(1978,11,23);
        birthdays.put("Sergey",birthDayTest);
        assertEquals(birthDayTest,birthdays.get("Sergey"));
    }
    @Test
    void removeBirthDayTest(){
        birthdays.remove("NEO");
        assertNull(birthdays.get("NEO"));
    }
    @Test
    void getBirthDayTest(){
        LocalDate data = birthdays.get("Jack");
        assertNotNull(data);
        assertEquals(tomCruise,data);
    }
    @Test
    void containsKey(){
       boolean date = birthdays.containsKey("NEO");
       assertTrue(date);
    }
    @Test
    void containsValueTest(){
        boolean date = birthdays.containsValue(schwarzenegger);
        assertTrue(date);
    }
    @Test
    void  keySetTest(){
        Set <String> keySet = birthdays.keySet();
        assertTrue(keySet.contains("NEO"));
        assertFalse(keySet.contains("NEOOO"));
        assertEquals(5,keySet.size());
    }
    @Test
    void forEachTest(){
        int count = 0;
        for (String s : birthdays.keySet()) {
            System.out.println(s);
            count++;
        }
        assertEquals(5,count);
    }
}