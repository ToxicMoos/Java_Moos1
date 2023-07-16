package Lesson25.employee;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] firma = new Employee[6];//массив состоящих из объектов ,каждый объект-эьо сотрудник
        firma[0] = new Manager(100,"John","Smith",160,5000,5);
        firma[1] = new SalesManager(101,"Rambo","Bob",150,20000,0.10);
        firma[2] = new SalesManager(102,"Robert","Douny Jr.",100,20000,0.1);
        firma[3] = new Worker(103,"Sabrina","Catch",140,20 );

    printArray(firma);
    double totalSalary =totalSalary(firma) ;
        System.out.println("Total month salary ="+totalSalary);

    }
    public static double totalSalary(Employee[] firma){
        double sum =0;
        for (int i = 0; i < firma.length; i++) {
            if (firma[i] != null){
                sum +=firma[i].calcSalary();
            }
        }
        return sum;
    }

    public static   void printArray(Object[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!= null){
                System.out.println(arr[i]);
            }
        }
    }
}

