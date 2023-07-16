package Lesson29.practicShapes;

//Площадь квадрата = сторона * сторона
//формула периметр квадрата P = 4 * side
public class Square extends Shape {
    public Square(double length) {
        super(length);
    }

    @Override
    public double calcArea( ) {
        return length * length; //вычисляем площадь квадрата
    }

    @Override
    public double calcPerimeter( ) {
        return 4 * length; //вычисляем лина периметра квадрата
    }




}