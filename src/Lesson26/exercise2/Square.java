package Lesson26.exercise2;
//Площадь квадрата = сторона * сторона
//формула периметр квадрата P = 4 * side
public class Square extends Shape {
    public Square(double length) {
        super(length);
    }

    @Override
    public double calcArea(double a) {
        return a * a; //вычисляем площадь квадрата
    }

    @Override
    public double calcPerimetr(double a) {
        return 4 * a; //вычисляем лина периметра квадрата
    }




}