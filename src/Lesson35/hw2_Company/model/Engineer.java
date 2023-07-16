package Lesson35.hw2_Company.model;

public class Engineer extends Employee   {
    //fields-------------
    private double salary;//зарплата
    private double rate;//ставка
    private int hours;//часы работы
    //constructor---------


    public Engineer(String name, int yearOfBirth, double experience, double salary, double rate, int hours) {
        super(name, yearOfBirth, experience);
        this.salary = salary;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calcSalary() {
        return salary = rate * hours;
    }
}
