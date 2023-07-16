package Lesson38.practice38.month;

public class MonthAppl {
    public static void main(String[] args) {
        Month month = Month.DEC;
        System.out.println(month);//напечатали
        System.out.println(month.plusMonth(3));//ожидаем MAR
        System.out.println(month.plusMonth(13));//ожидаем JAN
        System.out.println(Month.getName(14));//ожидаем FEB
        System.out.println("----------количество дней пр имени месяца-----------");
        //способ1
        Month month1 = Month.AUG;// взяли месяц в переменную
        System.out.println(month1.getDays());
        //способ2
        System.out.println(Month.AUG.getDays());//по имени месяца
    }
}
