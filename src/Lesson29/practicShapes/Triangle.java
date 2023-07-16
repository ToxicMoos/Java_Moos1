package Lesson29.practicShapes;

////Площадь треугольника  по Формула Герона : S = √ (p* (p-a)* (p-b)* (p-c)). Где p - полупериметр фигуры, то есть: p = (a+b+c)/2.
////формула периметр треугольника P = a + b + c
//public class Triangle extends Shape {
public class Triangle extends Shape {

   double sideB;

    public Triangle(double length, double sideB, double sideC) {
        super(length);
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double sideC;

    @Override// Метод для вычисления площади треугольника по формуле Герона
    public double calcArea( ) {
        double p = (length+sideB+sideC)/2;//полу-периметр
        double area = Math.sqrt(p* (p-length)* (p-sideB)* (p-sideC));//площадь треугольника
        return area;
    }

    ///вычисляем периметр треугольника

    @Override
    public double calcPerimeter() {

        return  length + sideB + sideC;//периметр треугольника
    }




    }
