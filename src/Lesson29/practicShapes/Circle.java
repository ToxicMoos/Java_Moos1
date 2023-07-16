package Lesson29.practicShapes;

//Площадь (A) = π × радиус (r)^2, где π (пи) - математическая константа, примерно равная 3.14159
//Формула расчета периметра круга: C = 2 · π · r,
//где C это периметр, r – радиус, π – число пи.

public  class Circle extends Shape {
    public Circle(double length) {
        super(length);
    }

    @Override
    public double calcArea() {
        return  Math.PI * length * length;//вычисляем площадь круга
    }

    @Override
    public double calcPerimeter( ) {
        return 2 * Math.PI * length; //вычисляем длину окружности
    }
}

