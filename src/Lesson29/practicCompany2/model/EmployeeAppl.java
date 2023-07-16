package Lesson29.practicCompany2.model;


public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] firma = new Employee[6];// массив, состоящий из объектов, каждый объект - это сотрудник
        firma [0] = new Manager(100, "John", "Smith", 174, 5000, 5);
        firma [1] = new SalesManager(101, "Bread", "Pit", 174, 300000, 0.1);
        firma [2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firma [3] = new WageEmployee(103, "Robert", "Downey Jr.", 80, 20);

        printArray(firma);
        double totalSalary = totalSalary (firma); //сигнатура
        System.out.println("Total month salary = " + totalSalary);

    }
    public static double totalSalary(Employee[]firma){
        double sum = 0;
        for (int i = 0; i < firma.length; i++) {
            if (firma[i] != null){
                sum += firma [i].calcSalary();
            }
        }
        return sum;
    }
    public static  void  printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] != null){
                System.out.println(arr[i]);
            }
        }
    }
}
