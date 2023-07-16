package Lesson25.employee;

public class SalesManager extends Employee {
    //поля класса
    private double salesValue;
    private double percent;

    //конструктор
    public SalesManager(int id, String firstName, String lastName, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    //getters and setters
    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
//implement method
    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return salary;
    }
}
