package homeWork15_0;
//Создать класс Работник (Employee) c полями:
//
//уникальный номер
//имя
//фамилия
//пол
//зарплата
//уровень налогообложения
// Создать приложение FirmaAppl в котором принять на работу несколько сотрудников.

public class Employee {

    public String name;
    public String surname;
    public String sex;
    public float salary;
    public int uniqueNumber;

//конструктор


    public Employee(String name, String surname, String sex, float salary, int uniqueNumber) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.salary = salary;
        this.uniqueNumber = uniqueNumber;
    }
    //Гетеры и сеттеры
////Геттер getName() позволяет получить текущее значение поля имени работника.
//// Он возвращает значение типа String, которое представляет название имени работника.
////
////Сеттер setName(String Name) позволяет установить новое значение для поля Name.
//// Он принимает параметр Name типа String, который представляет новое имени работника, и устанавливает его в поле имени работника текущего объекта.
    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //метод вывод на экран
    public void display(){
        System.out.print(" Name : " + name + ",");
        System.out.print(" Surname : " + surname+ ", ");
        System.out.print(" Sex : " + sex + ". ");
        System.out.print(" Salary : " + salary+ ". ");
        System.out.print(" UniqueNumber : " + uniqueNumber + ",");
        System.out.println();




    }
}

