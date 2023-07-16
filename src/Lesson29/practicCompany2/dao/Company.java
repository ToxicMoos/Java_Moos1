package Lesson29.practicCompany2.dao;

import Lesson29.practicCompany2.model.Employee;

public interface Company {
    // перечень действий = методов

    // берем на работу
    boolean addEmployee(Employee employee);// добавить сотрудника в компанию

    // увольнение
    Employee removeEmployee(int id); // удаляем сотрудника из компании

    // найти сотрудника по id
    Employee findeEmployee(int id);// Searching for an employee within the company

    // размер компании
    int size(); //method

    // печатаем список компании
    void printEmployee(); //method


}
