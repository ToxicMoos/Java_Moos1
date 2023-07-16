package Lesson39.practice39.time.for_hw39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {
    DateOperation dateOperations;
    LocalDate[] array;

    @BeforeEach
    void setUp() {
        String birthDate1 = "1978-11-23";
        String[] arr = {"1969-10-15","1982-07-12","1978-11-23"};// Массив дат

        // Создание объектов LocalDate для трех композиторов
        LocalDate mozart = LocalDate.of(1756,01,27);
        LocalDate tchaikovsky = LocalDate.of(1840,05,07);
        LocalDate beethoven = LocalDate.of(1770,12,17);

        LocalDate[] array = {tchaikovsky,mozart,beethoven};
    }

    @Test
    void getAge() {
        String birthDate1 = "1978-11-23";
        //assertEquals-Это метод из библиотеки JUnit для проверки, что два значения равны.
        assertEquals(44, DateOperation.getAge(birthDate1));
    }


    @Test
    void sortStringDates() {
        String[] unsortedDates = {
                "1969-10-15",
                "1982-07-12",
                "1978-11-23"
        };

        String[] sortedDates = {
                "1969-10-15",
                "1978-11-23",
                "1982-07-12"
        };

        assertArrayEquals(sortedDates, DateOperation.sortStringDates(unsortedDates));//assertEquals-Это метод из библиотеки JUnit для проверки, что два значения равны.
    }

}
