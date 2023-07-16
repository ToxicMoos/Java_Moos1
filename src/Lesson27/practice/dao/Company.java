package Lesson27.practice.dao;

import Lesson27.practice.model.Employee;

public interface Company {
    // перечень действий = методов

    // берем на работу
    boolean addEmployee(Employee employee);// добавить сотрудника в компанию

    // увольнение
    Employee removeEmployee(int id); // удаляем сотрудника из компании

    // найти сотрудника по id
    Employee findeEmployee(int id);// ищем сотрудника в компании

    // размер компании
    int size();

    // печатаем список компании
    void printEmployee();


}
