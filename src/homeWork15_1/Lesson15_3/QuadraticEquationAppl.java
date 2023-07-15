package homeWork15_1.Lesson15_3;
//вычисления дискриминанта b*b - 4 * a *c
//определения количества корней в зависимости от значения дискриминанта (d>0 - два корня, d=0 - один корень, d<0 - корней нет) Вызвать методы из приложения QuadraticEquationAppl

public class QuadraticEquationAppl {
    public static void main(String[] args) {
        QuadraticEquations equations = new QuadraticEquations(3,4,5);
        double discriminant= equations.discriminantCalculation();
        double numberOfRoots=equations.determiningNumberOfRoots();
        System.out.println("discriminant "+discriminant);
        System.out.println("NumberOfRoots "+numberOfRoots);


    }
}
