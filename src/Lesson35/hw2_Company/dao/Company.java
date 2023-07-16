package Lesson35.hw2_Company.dao;

import Lesson35.hw2_Company.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee); // add an employee to the company
    Employee removeEmployee(String name );//remove the employee from the company
    Employee findEmployee(String name); // Searching for an employee within the company
    int sizeOfEmployee();
    void  printOfEmployee(Object[] arr);
}
