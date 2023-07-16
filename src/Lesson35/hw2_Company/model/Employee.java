package Lesson35.hw2_Company.model;

import java.util.Objects;

public abstract class Employee {
    //поля классов
    private String name;
    private int yearOfBirth;//год рождения
    private double experience;//опыт работы


    //конструктор----------------------

    public Employee(String name, int yearOfBirth, double experience) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
    }


    //getters and setters--------------


    //toString-----------------


    @Override
    public String toString() {
        return "Employee{" + "name='" + name  + ", yearOfBirth=" + yearOfBirth + ", experience=" + experience  + '}';
    }
    //equals--------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfBirth == employee.yearOfBirth && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    //method-------------


    public abstract double calcSalary();
}
