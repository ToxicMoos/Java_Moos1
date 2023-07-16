package Lesson35.hw2_Company.dao;

import Lesson35.hw2_Company.model.Employee;

public class CompanyImpl implements Company {
    //fields
    private Employee[] employees;
    private int size;//размер компании (ограничении)
    //constructor


    public CompanyImpl() {
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(String name) {
        return null;
    }

    @Override
    public Employee findEmployee(String name) {
        for (int i = 0; i < size; i++) {

        }
        return null;
    }

    @Override
    public int sizeOfEmployee() {
        return 0;
    }


    @Override
    public void printOfEmployee(Object[] arr) {

    }


}

