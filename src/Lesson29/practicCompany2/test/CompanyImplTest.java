package Lesson29.practicCompany2.test;

import Lesson29.practicCompany2.dao.Company;
import Lesson29.practicCompany2.dao.CompanyImpl;
import Lesson29.practicCompany2.model.Employee;
import Lesson29.practicCompany2.model.Manager;
import Lesson29.practicCompany2.model.SalesManager;
import Lesson29.practicCompany2.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CompanyImplTest {
    Company company; // создали объект класса Company
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(6);
        firm = new Employee[5];//пытаемся добавить существующего
        //создаем работников
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new WageEmployee(103, "Robert", "Robert", 80,20 );

        //добавляем работников компанию
        for (int i = 0; i < firm.length; i++) {  //добавление сотрудников по индексу
            company.addEmployee(firm[i]);
        }
    }



    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));//нельзя добавить "несуществующего" сотрудника
//        assertTrue(company.addEmployee(firm[0]));//добавился сотрудника
//        assertTrue(company.addEmployee(firm[1]));//добавился сотрудника
//        assertTrue(company.addEmployee(firm[2]));//добавился сотрудника
//        assertTrue(company.addEmployee(firm[3]));//добавился сотрудника
        assertEquals(4,company.size());//ожидаем рост размера компании
        //должен расширить размер массива и добавить сотрудника
        //нельзя добавить уже имеющегося сотрудника
        //assertFalse(company.addEmployee(firm[2]));//пытаемся добавить существующего сотрудника
        //нельзя выйти за размер массива

        Employee employee = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.size());
        assertFalse(company.addEmployee(firm[3]));// нельзя добавить уже имеющегося сотрудник
        employee = new SalesManager(106, "Vasia", "Ivanov", 180, 40000, 0.1);
        assertFalse(company.addEmployee(employee)); //нельзя выйти за размер компании
    }

    @Test
    void removeEmployee() {
//        company.addEmployee(firm[2]);
        System.out.println("было "+company.size());
        assertEquals(firm[2],company.removeEmployee(102));
        System.out.println("стало "+company.size());

    }

    @Test
    void findEmployee() {
        System.out.println("количество сотрудников "+company.size());
        assertEquals(firm[1],company.findeEmployee(101));
    }

    @Test
    void size() {
        System.out.println("количество сотрудников "+company.size());
        assertEquals(4,company.size());
    }

    @Test

    void printEmployees() {
        company.printEmployee();
    }
}