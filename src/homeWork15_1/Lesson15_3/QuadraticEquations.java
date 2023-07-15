package homeWork15_1.Lesson15_3;

//Создать класс, описывающий квадратные уравнения с коэффициетами a, b и c. Реализовать в нем методы:
//вычисления дискриминанта b*b - 4 * a *c
//определения количества корней в зависимости от значения дискриминанта (d>0 - два корня, d=0 - один корень, d<0 - корней нет) Вызвать методы из приложения QuadraticEquationAppl
public class QuadraticEquations {
    public double a;
    public double b;
    public double c;

    public QuadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //метод  вычисления дискриминанта b*b - 4 * a *c
    public double discriminantCalculation(){
        return b*b - 4 * a *c;
    }

    public double determiningNumberOfRoots(){
        double discriminant=discriminantCalculation();
        if (discriminant>0){
            return 2 ;

        } else if (discriminant==0) {
            return 1;


        }else
            return 0;

    }

}
