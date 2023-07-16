package Lesson31.dao;

import Lesson31.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] cars;


    @BeforeEach
    void setUp() {
        garage = new GarageImpl(7);//вместимость гаража
        cars = new Car[6]; //флот из машин = 6 штук
        cars[0] = new Car("BV 100","Audi", "BVG", 2.0, "Silver");
        cars[1] = new Car("BV 101","Mercedes", "BVG",3.5, "Blue");
        cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White");
        cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue" );
        cars[4] = new Car("BV 104", "Mercedes", "RIT", 4.0, "Gray");
        cars[5] = new Car("BV 105", "Audi", "BVG", 5.0, "Black");

        //поместить машины в массив
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);// позволяет добавить машину с указанными характеристиками в гараж.
        }
    }

    @Test
    void addCar() {
//        assertEquals(6, garage.size());
//        assertFalse(garage.addCar(null));//Нельзя добавить "пустую"  машину.
//        assertFalse(garage.addCar(cars[0]));// Машина с таким номером уже есть в гараже.
//        Car car1 = new Car("BV 106", "VW", "BIR", 3.0, "Blue");
//        assertTrue(garage.addCar(car1));// Успешное добавление новой машины.
//        assertEquals(7,garage.size());
        assertFalse(garage.addCar(null));//добавить null нельзя
        assertEquals(6,garage.size());//проверяем размер гаража
        Car car1 = new Car("BV 106","Citroen","IBM",3.8,"Red");
        assertTrue(garage.addCar(car1));//добавляем ешё одну машину
        assertEquals(7,garage.size());//проверяем размер гаража
        car1 = new Car("BV 106","Honda","Sony",4.2,"green");
        assertFalse(garage.addCar(car1));//не можем добавить машину сверх capacity




    }

    @Test
    void removeCar() {
        assertEquals(6,garage.size());//сравниваем ожидаемое количество сашин в гараже с ,актуальным числом
        assertEquals(cars[0],garage.removeCar("BV 100"));//удаляем машину по regNumber
        assertEquals(5,garage.size());//после удаления,сравниваем ожидаемое количество сашин в гараже с ,актуальным числом
//        assertEquals(6, garage.size());
//        assertNull(garage.removeCar("BV 200")); // Машина с таким номером отсутствует в гараже.
//        Car removedCar = garage.removeCar("BV 101");
//        assertNotNull(removedCar);// Проверяем, что удаленная машина не равна null
//        assertEquals("Mercedes", removedCar.getModel());
//        assertEquals(5, garage.size());// После удаления одной машины размер должен уменьшиться на 1
//        assertNull(garage.findCarByRegNumber("BV 101")); // Проверяем, что машина была удалена.


    }

    @Test
    void findCarByRegNumber() {
//        Car foundCar = garage.findCarByRegNumber("BV 102");
//        assertNotNull(foundCar); // Проверяем, что машина была найдена
//        assertEquals("Opel", foundCar.getModel());
//        assertNull(garage.findCarByRegNumber("BV 200")); // Машина с таким номером отсутствует в гараже.
        assertEquals(cars[0],garage.findCarByRegNumber("BV 100"));//ищем имеющуюся машину по regNumber
        assertEquals(null,garage.findCarByRegNumber("BV 5000"));//ищем НЕ имеющуюся машину по regNumber
    }

    @Test
    void findCarsByModel() {

//        Car[] audiCars = garage.findCarsByModel("Audi");
//        assertEquals(2, audiCars.length);
//        assertArrayEquals(new Car[]{cars[0],cars[5]},audiCars);
        Car[] expected ={cars[0],cars[5]};
        assertArrayEquals(expected, garage.findCarsByModel("Audi"));



        Car[] bmwCars = garage.findCarsByModel("BMW");
        assertEquals(1, bmwCars.length);
        assertArrayEquals(new Car[]{cars[3]},bmwCars);

        Car[] ladaCars = garage.findCarsByModel("Lada");
        assertEquals(0, ladaCars.length);
        assertArrayEquals(new Car[]{},ladaCars);// Машин марки lada нет в гараже.
    }

    @Test
    void findCarsByCompany() {
//        Car[] bvgCars = garage.findCarsByCompany("BVG");
//        assertEquals(2, bvgCars.length);
//        assertArrayEquals(new Car[]{cars[1],cars[5]},bvgCars);
//
//
//        Car[] bsrCars = garage.findCarsByCompany("BSR");
//        assertEquals(1, bsrCars.length);
//        assertArrayEquals(new Car[]{cars[2]},bsrCars);
//
//
//        Car[] tirCars = garage.findCarsByCompany("TIR");
//        assertEquals(0, tirCars.length);
//        assertArrayEquals(new Car[]{},tirCars); // Машин от компании BIR нет в гараже.
        Car[] expected = {cars[0],cars[1],cars[5]};
        Car[] actual = garage.findCarsByCompany("BVG");
        assertArrayEquals(expected,actual);
    }

    @Test
    void findCarsByEngine() {
//        Car[] foundCars = garage.findCarsByEngine(1.8, 2.0);
//        assertEquals(2, foundCars.length);
//        assertArrayEquals(new Car[]{cars[0], cars[2]},foundCars);
//
//        foundCars = garage.findCarsByEngine(0.0, 2.8);
//        assertEquals(3,foundCars.length);
//        assertArrayEquals(new Car[]{cars[0],cars[2],cars[3]},foundCars);
//
//        foundCars = garage.findCarsByEngine(5.5, 6.5);
//        assertEquals(0, foundCars.length);
//        assertArrayEquals(new Car[]{},foundCars);


    }
    @Test
    void findCarsByColor() {
//        Car[] silverCars = garage.findCarsByColor("Silver");
//        assertEquals(1, silverCars.length);
//        assertArrayEquals(new Car[]{cars[0]},silverCars);
//
//        Car[] blueCars = garage.findCarsByColor("Blue");
//        assertEquals(2, blueCars.length);
//        assertArrayEquals(new Car[]{cars[1],cars[3]},blueCars);
//
//
//        Car[] redCars = garage.findCarsByColor("Red");
//        assertEquals(0, redCars.length);
//        assertArrayEquals(new Car[]{},redCars); // Машин красного цвета нет в гараже.
// }
        Car[] expected = {cars[1],cars[3]};
        Car[] actual = garage.findCarsByColor("Blue");
        assertArrayEquals(expected,actual);
}
}