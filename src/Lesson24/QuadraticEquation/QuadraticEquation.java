package Lesson24.QuadraticEquation;
//Оформить решение квадратного уравнения как класс с необходимыми методами,
// в решении использовать переменные типа классов-оберток, сделать необходимые тесты.
public class QuadraticEquation {

    private Double a;
    private Double b;
    private Double c;

    //конструктор
    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //методы
    public Double [] solution1 () {
        double  D = b * b - 4 * a * c;//вычисляем дискриминант с помощью формулы discriminant = b * b - 4 * a * c
        System.out.println("Discriminant: " + D);
        System.out.println();

        if (D > 0) {//Если discriminant > 0, то у уравнения есть два корня.
            double x1 = (-b + Math.sqrt(D)) / (2 * a);  //формулу корней (-b ± √D) / (2a)
            double x2 = (-b - Math.sqrt(D)) / (2 * a);  //формулу корней (-b ± √D) / (2a)
            System.out.println("The equation has 2 solutions:");
            System.out.println("Root 1: "+x1);
            System.out.println("Root 2: "+x2);
            return new Double[]{x1,x2};

        } else if (D == 0) {//Если discriminant == 0, то у уравнения есть один корень:
            double x = -b / (2 * a);
            System.out.println("The equation has 1 solutions:");
            System.out.println("Root  : "+x);
            return new Double[]{x};
        } else {//Если discriminant < 0, то уравнение не имеет вещественных корней
            double x0 = 0;
            System.out.println("The equation has NO solutions:");
            return new Double[]{};
        }


    }
}







