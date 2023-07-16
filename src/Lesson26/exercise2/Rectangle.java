package Lesson26.exercise2;
////вычисляем площадь прямоугольника : Площадь = Длина * Ширина , Периметр прямоугольника вычисляется с помощью формулы:
//Периметр = 2 * (Длина + Ширина)
public class Rectangle extends Shape{
    double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea(double length) {//вычисляем площадь прямоугольника
        return getLength()*getWidth();
    }

    @Override
    public double calcPerimetr(double length) {//вычисляем Периметр прямоугольника
        return 2*(getLength()+getWidth());
    }
}
