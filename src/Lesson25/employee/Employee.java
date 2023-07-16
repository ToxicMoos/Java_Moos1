package Lesson25.employee;
import java.util.Objects;

public abstract class Employee {
    //поля
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected double hours;

  //конструктор
    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }
    //getters and setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    //сравниваем сотрудников по ID . вызываем equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //toString() делаем улучшаем
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee");
        sb.append("id = ").append(id);
        sb.append(",  first tName = ' ").append(firstName).append('\'');
        sb.append(",  last tName = ' ").append(firstName).append('\'');
        sb.append(", hours =").append(hours);
        sb.append(",Salary =").append(calcSalary());
        return sb.toString();
        //воспользуемся  классом StringBuilder
//        return "Employee{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", hours=" + hours +
//                '}';
    }
    public abstract double calcSalary();

}
