package homeWork15_1.age;

public class Cube {



    private double side; // сторона куба

    // Конструктор класса Cube
    public Cube(double side) {
        this.side = side;
    }

    // Метод для определения периметра куба
    public double calculatePerimeter() {
        return 12 * side;
    }

    // Метод для определения площади куба
    public double calculateArea() {
        return 6 * side * side;
    }

    // Метод для определения объема куба
    public double calculateVolume() {
        return side * side * side;
    }



}

