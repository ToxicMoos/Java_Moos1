package Lesson26.exercise2;
//Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
// один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {
     //поля класса
     double length;//длина какого-то ребра, для окружности-радиус, для квадрата сторона,для треугольника сторона

     //конструктор
     public Shape(double length) {
          this.length = length;
     }
     public Shape(){}

     //getters and setters

     public double getLength() {
          return length;
     }

     public void setLength(double length) {
          this.length = length;
     }

     //abstract method
     public abstract double calcArea(double length);



     public abstract double calcPerimetr(double length);

}
