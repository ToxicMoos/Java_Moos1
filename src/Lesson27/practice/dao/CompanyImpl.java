package Lesson27.practice.dao;

import Lesson27.practice.model.Employee;

public class CompanyImpl implements Company{
    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findeEmployee(int id) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }
}
