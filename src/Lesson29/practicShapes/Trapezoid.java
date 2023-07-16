package Lesson29.practicShapes;
//Формула для вычисления площади трапеции:
//Площадь = ((a + b) * h) / 2
//Формула для вычисления периметра трапеции, нужно сложить длины всех её сторон.
//Периметр = a + b + c + d
public class Trapezoid extends Shape {
    //поля
    double sideB;
    double sideC;
    double sideD;
    double height;



    //конструктор


    public Trapezoid(double length, double sideB, double sideC, double sideD, double height) {
        super(length);
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return ((length + sideB) * height) / 2;
    }

    @Override
    public double calcPerimeter() {
        return (length + sideB + sideC + sideD);
    }
}
