package Lesson28.practicCompany.test;

import Lesson28.practicCompany.dao.Company;
import Lesson28.practicCompany.dao.CompanyImpl;
import Lesson28.practicCompany.model.Employee;
import Lesson28.practicCompany.model.Manager;
import Lesson28.practicCompany.model.SalesManager;
import Lesson28.practicCompany.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CompanyImplTest {
    Company company; // создали объект класса Company
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(6);
        firm = new Employee[5];//пытаемся добавить существующего
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new WageEmployee(103, "Robert", "Robert", 80,20 );

//        for (int i = 0; i < firm.length; i++) {  //добавление сотрудников по индексу
//            company.addEmployee(firm[i]);
//        }
    }



    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));//нельзя добавить "несуществующего" сотрудника
        assertTrue(company.addEmployee(firm[3]));//добавился сотрудник
        //должен расширить размер массива и добавить сотрудника
        //нельзя добавить уже имеющегося сотрудника
        //assertFalse(company.addEmployee(firm[2]));//пытаемся добавить существующего сотрудника
        //нельзя выйти за размер массива
        firm[4] = new SalesManager(106,"Peter","Petrov",180,40000,0.1);
        assertTrue(company.addEmployee(firm[4]));
        assertFalse(company.addEmployee(firm[4]));
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void size() {
    }

    @Test
    void printEmployees() {
    }
}