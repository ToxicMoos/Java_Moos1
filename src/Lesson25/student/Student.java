package Lesson25.student;

import java.util.Random;

// Имеется список студентов с их фамилиями (задать внутри программы). Распределить студентов на 2 примерно равных группы (+/- 1 человек) случайным образом.
// сначала написать словами алгоритм того, как это будет делаться;
//реализовать алгоритм в коде;
//при реализации использовать метод(ы);
//создать тесты.
//поля
public class Student {
    private String[] students = {"Tom", "Bil", "Arnold", "Kianu", "Angelina", "King", "Bread", "Kirk", "Uchura", "Pit","Rambo"};
    private String[] group1  ;
    private String[] group2  ;
    //конструкторы
    public Student(String[] students, String[] group1, String[] group2) {
        this.students = students;
        this.group1 = group1;
        this.group2 = group2;
    }

    //массивы
    public static String[] distributeStudents1(String[] students) {  //принимает массив студентов и возвращает первую группу
        int totalStudents = students.length;//Получаем общее количество студентов в массиве students
        int groupSize = totalStudents / 2;//Вычисляем размер первой группы путем деления общего количества студентов на 2.

        String[] group1 = new String[groupSize];//Создаем массив group1 с размером groupSize для хранения первой группы студентов.

        Random random = new Random();
        for (int i = 0; i < groupSize; i++) {
            int randomIndex = random.nextInt(totalStudents - i);//Генерируем случайный индекс в диапазоне от 0 до оставшегося количества студентов.
            group1[i] = students[randomIndex];//Присваиваем студента из массива students сгенерированному индексу в текущей позиции i массива group1.
            students[randomIndex] = students[totalStudents - i - 1];//Заменяем выбранного студента последним студентом в массиве students, чтобы избежать повторного выбора этого студента.
        }
        return group1;
    }
    public static String[] distributeStudents2(String[] students, int groupSize) {//// Получение оставшихся студентов для второй группы
        int totalStudents = students.length;
        int remainingGroupSize = groupSize + totalStudents % 2;

        String[] group2 = new String[remainingGroupSize];

        for (int i = 0; i < remainingGroupSize; i++) {
            group2[i] = students[i + groupSize];//Присваиваем студента из массива students с позиции i + groupSize в текущую позицию i массива group2.
        }

        return group2;
    }



}



