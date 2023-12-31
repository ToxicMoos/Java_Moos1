package Lesson28.practicCompany.dao;

import Lesson28.practicCompany.model.Employee;

public class CompanyImpl implements Company {
    //поле
    private Employee[] employees;
    private int size;//размер компании (ограничении)
    //Конструктор
    public CompanyImpl(int capacity){
        employees = new Employee[capacity];//capacity = становится длиной массива
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findeEmployee(employee.getId()) != null){
            return false;
        }
       employees[size] = employee;//добавление в конец массива
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {

        return null;
    }

    @Override
    public Employee findeEmployee(int id) {
        for (int i = 0; i < size; i++) {
             if (employees[i].getId()==id) {
                 return employees[i];
             }
        }
        return null;
    }

    @Override
    public int size() {
        return size ;
    }

    @Override
    public void printEmployee() {

    }
}
