package Lesson26.exercise2;
////Площадь треугольника  по Формула Герона : S = √ (p* (p-a)* (p-b)* (p-c)). Где p - полупериметр фигуры, то есть: p = (a+b+c)/2.
////формула периметр треугольника P = sideA* sideB * sideC / 2
//public class Triangle extends Shape {
public class Triangle extends Shape{

    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcArea(double a) {
        return a * a * Math.sqrt(3) / 4.0;
    }///вычисляем площадь треугольника

    @Override
    public double calcPerimetr(double a) {
        return a * 3;
    } ///вычисляем периметр треугольника
}