package Lesson32.hw32.cars.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {
    Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[]{
                new Car("BV 103","BMW","Kiwi",5.4,"Red"),
                new Car("BV 101","Audi","Bora",3.2,"Black"),
                new Car("BV 104","Mercedes","Audi",2.1,"White"),
                new Car("BV 100","Opel","Yofi",1.4,"Silver"),
                new Car("BV 102","Ferrari","Fera",6.5,"Gold"),
        };
    }
    @Test
    void  CarSortModel(){
        System.out.println("-----Unsorted Cars-----");
        printArray(cars);
        System.out.println();
        System.out.println("-----Sorted Cars by engine---- ");
        Arrays.sort(cars);
        printArray(cars);

    }
    @Test
    void  CarSortCompany(){
        System.out.println("-----Unsorted Cars-----");
        printArray(cars);
        System.out.println();
        System.out.println("-----Sorted Cars by Company---- ");
        Arrays.sort(cars);
        printArray(cars);
    }
    @Test
    void carComparator( ){
        Comparator<Car> carComparator = new Comparator<Car>(){

            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        };

    }


    //----------Method--------------
    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}