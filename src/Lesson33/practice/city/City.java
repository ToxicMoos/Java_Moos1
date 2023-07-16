package Lesson33.practice.city;

import java.util.Objects;

public class City implements Comparable<City> {
    //Практика сортировки массивов:
    //создать класс City с полями название (name) и население (population), внести в массив 8 - 10 городов,
    // выполнить сортировку по названию и размеру населения.
    // Добавить уровень загрязнения в % от 100% и выполнить сортировку по алфавиту, населению и загрязнению.
    private String name;
    private int population;
    private int pollution;//загрязнение
    private String postcode;
    //constructor

    public City(String name, int population, int pollution, String postcode) {
        this.name = name;
        this.population = population;
        this.pollution = pollution;
        this.postcode = postcode;
    }


    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPollution() {
        return pollution;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    //toString

    @Override
    public String toString() {
        return "City{" + "name = '" + name  + ", population = " + population + ", pollution = " + pollution + ", postcode = "+postcode+ '}';
    }

    //equals -сравнения
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(postcode, city.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postcode);
    }
//method compareTo
    @Override
    public int compareTo(City o) {//City o - это второй объект из сравниваемых. А где первый объект, с которым происходит сравнение?
//        return this.name.compareTo(o.name);//сортируем по именам по алфавиту, такой естественный порядок для этого класса
        return (this.pollution - o.pollution);//сортируем по количества население, при минусе в обратную сторону
    }
}
