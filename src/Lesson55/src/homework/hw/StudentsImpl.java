package Lesson55.src.homework.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class StudentsImpl {
    private static List<Students> arrList;

    public static void main(String[] args) {
        Students st1 = new Students("John",45,29,9.1);
        Students st2 = new Students("Ketty",40,28,7.6);
        Students st3 = new Students("Radi",35,25,8.2);
        Students st4 = new Students("Andy",30,30,6.7);
        Students st5 = new Students("Natalie",25,22,5.6);

       arrList = new ArrayList<>();

        arrList.add(st1);
        arrList.add(st2);
        arrList.add(st3);
        arrList.add(st4);
        arrList.add(st5);
        System.out.println("---------------------Action-------------------------------");

        //это Лямбда-выражение представляет собой анонимную функцию,которая принимает аргумент 'x', и выполняет действие, которое в фигурных скобках {}.
        Action<Students> action = x -> System.out.println(x.getName());// -> это тело лямбда-выражения.  вызываем метод getName() у объекта x , и  выводим на экран с помощью System.out.println.
        for (Students s : arrList) {
            action.execute(s);
        }
        System.out.println("---------------------Condition-------------------------------");
//y - это параметр, который представляет каждого студента из списка arrList.
        Condition<Students> condition = y -> y.getGrade() > 7.0;//y.getGrade() > 7.0 Условие сравнивает оценку студента с числом 7.0 и возвращает true, если оценка больше 7.0.
        for (Students students : arrList) {
            if (condition.test(students)){
                System.out.println(students.getName());
            }
        }
        System.out.println("---------------------------Provider-----------------------------------");

        Provider<Students> createStud = () -> new Students("Rambo", 20, 18, 7.0);//Пустые скобки () означают, что метод provide() не принимает аргументов
        Students newStudent = createStud.provide();//  вызываеv метод provide() у объекта createStud, чтобы создать нового студента.
        System.out.println("новый студент - "+ newStudent.getName());//вызывает метод getName() у объекта newStudent, чтобы получить имя нового студента.

        System.out.println("---------------------------------------ttttttttttttttttttt");


        for (Students s : getStudents() ) {
            if (s.getAge() > 35){
                System.out.println(s);
            }

        }

    }
    public static List<Students> getStudents(){
        return arrList;
    }
}



