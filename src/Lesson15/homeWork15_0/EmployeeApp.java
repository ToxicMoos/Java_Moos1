package Lesson15.homeWork15_0;

public class EmployeeApp {
    public static void main(String[] args) {
        //обьект
        Employee employee1 = new Employee("John " ,"Rambo " ,"male " ,50000.500f,800965);
        Employee employee2 = new Employee( "Angelina ","Jolie ","Female ",300000.300f,7000415) ;
        Employee employee3 = new Employee("Barak","Obama","unknown",1000000f,1000000001 );

        //вывод обьекта на экран
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
