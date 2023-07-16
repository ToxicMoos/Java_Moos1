package Lesson25.student;
import java.util.Arrays;//Класс Arrays предоставляет удобные методы для работы с массивами в Java. Например,метод Arrays.toString() для преобразования массива в строку.

public class StudentAppl {

        public static void main(String[] args) {
            String[] students = {"Tom", "Bil", "Arnold", "Kianu", "Angelina", "King", "Bread", "Kirk", "Uchura", "Pit","Rambo"};
//объекты класса
            String[] group1 = Student.distributeStudents1(students);
            String[] group2 = Student.distributeStudents2(students, group1.length);

            // Выводим результаты распределения студентов
            System.out.println("Группа 1: " + Arrays.toString(group1));
            System.out.println("Группа 2: " + Arrays.toString(group2));
        }
}