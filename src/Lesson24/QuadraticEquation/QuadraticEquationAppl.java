package Lesson24.QuadraticEquation;

public class QuadraticEquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(2.0, -5.0, -3.0);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(3.3,-4.8,7.0);

        quadraticEquation1.solution1();
        System.out.println();
        quadraticEquation2.solution1();
    }
}
