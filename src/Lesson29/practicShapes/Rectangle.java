package Lesson29.practicShapes;

////вычисляем площадь прямоугольника : Площадь = Длина * Ширина , Периметр прямоугольника вычисляется с помощью формулы:
//Периметр = 2 * (Длина + Ширина)
public class Rectangle extends Shape {
    //поля
    double width;
//конструктор
    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

//перезаписанный метод
    @Override
    public double calcArea( ) {
        return length * width;
    } //вычисляем площадь прямоугольника

    @Override
    public double calcPerimeter( ) {//вычисляем Периметр прямоугольника

        return 2*(length + width);
    }
}
