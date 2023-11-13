package Lesson55.src.homework.hw;

public class Students {
    //fields
    private String name;
    private int age;
    private int cohort;
    private double grade;
    //constructor

    public Students(String name, int age, int cohort, double grade) {
        this.name = name;
        this.age = age;
        this.cohort = cohort;
        this.grade = grade;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCohort() {
        return cohort;
    }

    public double getGrade() {
        return grade;
    }


    //toString


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cohort=" + cohort +
                ", grade=" + grade +
                '}';
    }
}
