package Lesson42.practice.solution;
import   Lesson42.practice.try_catch.NoSolutionExep;

public class SolutionAppl    {
    public static void main(String[] args) {
        //a * x = b  ,x = b / a;    a , b - int
        //
    try {
        int a = 12;
        int b = 36;
        int x = solution(a,b);//решение

        System.out.println("X = " + x);

    }catch (NoSolutionExep e ){
        System.out.println("No solution" );
    }catch (AnyNumberSolution e){
        System.out.println("Any Number is Solution: ");
    }finally {
        System.out.println("Bye Bye!");
    }

    }
    //--------------method--------------------
    public static int solution(int a,int b)throws NoSolutionExep {
//        int x = b / a;
        int res;
        if (a==0 && b != 0){
            throw  new NoSolutionExep();
        }
        if (a==0 && b == 0){
            throw new AnyNumberSolution();
        }
        res= b/a;
        return res;
    }

}
