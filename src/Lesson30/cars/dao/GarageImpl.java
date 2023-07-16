package Lesson30.cars.dao;

import Lesson30.cars.model.Car;

public class GarageImpl implements Garage{
    //поля
    private Car[] cars;

    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
//        cars[size] = car; // ставим в конец массива
//        size++;
        cars[size++] = car; // постфиксная операция ++ увеличит size после присвоения
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car temp = cars[i];
                cars[i] = cars[--size];// на место удаленного ставим последний
                cars[size] = null;
                return temp;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {

        Car[] existingCars = new Car[size]; // Создаем временный массив для хранения найденных машин
        int count = 0; // Счетчик найденных машин
        for (int i = 0; i < size; i++) {
            if (model.equals(cars[i].getModel())) {// проверяет, совпадает ли значение переменной model с моделью машины, представленной объектом Car в массиве cars по индексу i."
                existingCars[count++] = cars[i]; // добавляем машину в массив, если модель совпадает
            }
        }
        // Создаем новый массив с размером count (количество найденных машин) и копируем в него найденные машины
        Car[] result = new Car[count];
        System.arraycopy(existingCars, 0, result, 0, count);//статический метод класса System в Java,
        // который используется для копирования элементов из одного массива в другой.
        return result;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        Car[] existingCars = new Car[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (company.equals(cars[i].getCompany())) {
                existingCars[count++] = cars[i];
            }
        }
        Car[] result = new Car[count];
        for (int i = 0; i < count; i++) {
            result[i] = existingCars[i];
        }
        return result;
    }
    @Override
    public Car[] findCarsByEngine ( double min, double max) {
        Car[] existingCars = new Car[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            double engineCapacity = cars[i].getEngine();//извлекает значение емкости двигателя из объекта
            if (engineCapacity >= min && engineCapacity <= max) { // условное выражение, которое проверяет,
                // находится ли значение переменной engineCapacity в диапазоне между значениями min и max.
                existingCars[count++] = cars[i];
            }
        }
        Car[] result = new Car[count];
        for (int i = 0; i < count; i++) {
            result[i] = existingCars[i];
        }
        return result;

    }
    @Override
    public Car[] findCarsByColor (String color) {
        Car[] existingCars = new Car[size];// Создаем временный массив для хранения найденных машин
        int count = 0;// Счетчик найденных машин
        for (int i = 0; i < size; i++) {
            if (color.equals(cars[i].getColor())) {
                existingCars[count++] = cars[i];// добавляем машину в массив, если модель совпадает
            }
        }
        Car[] result = new Car[count]; // Создаем новый массив с размером count (количество найденных машин) и копируем в него найденные машины
        for (int i = 0; i < count; i++) {
            result[i] = existingCars[i];// операция копирования элементов из массива existingCars в массив result.
        }
        return result;
    }
    @Override
    public int size () {
        return size;
 }
 }