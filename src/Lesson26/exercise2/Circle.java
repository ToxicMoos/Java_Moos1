package Lesson26.exercise2;

//Площадь (A) = π × радиус (r)^2, где π (пи) - математическая константа, примерно равная 3.14159
//Формула расчета периметра круга: C = 2 · π · r,
//где C это периметр, r – радиус, π – число пи.

public  class Circle extends Shape  {
    public Circle(double length) {
        super(length);
    }

    @Override
    public double calcArea(double a) {
        return  Math.PI * a * a;//вычисляем площадь круга
    }

    @Override
    public double calcPerimetr(double a) {
        return 2 * Math.PI * a; //вычисляем длину окружности
    }
}

