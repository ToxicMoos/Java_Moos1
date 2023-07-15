package homeWork15_1.rectangle.controller.model;

public class Rectangle {
    //этт файл и есть капсула для Rectangle
//Название класса всегда с большой буквы

    //Шаг 1: Определяем поля класса
    public double length;     //длина

    public double weight;     //ширина

    //шаг 2 - определяем методы
    // Конструктор класса Rectangle


    public Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public double peimeter(double a, double b) { //метод для вычисления периметра           //Метод для определения площади
        return 2*a +2*b;
    }

    public double square(double a,double b) {           //Метод для определения площади
        return a*b;
    }
}



