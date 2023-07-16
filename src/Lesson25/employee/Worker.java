package Lesson25.employee;
// worker : salary = hours * wage

public class Worker extends Employee {
    //поля класса
    private double wage;  // почасовая ставка

    //конструктор
    public Worker(int id, String firstName, String lastName, double hours, double wage) {
        super(id, firstName, lastName, hours);
        this.wage = wage;
    }

    //getters and setters

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double calcSalary() {
        double salary = hours * wage;
        return salary;
    }
}
