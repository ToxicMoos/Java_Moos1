package Lesson25.bus;

//Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте, длина маршрута.
// Реализовать методы go, stop, speedUp, speedDown
public class Bus {
    //поле класса
    String name; //номер маршрута
    int capacity; //вместимость
    int speed; //скорость на маршруте
    double routeLength; // длина маршрута.
    //конструкторы
    public Bus(String name, int capacity, int speed, double routeLength) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.routeLength = routeLength;
    }
    //getters and  setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }


//методы

    public void go( ){
        System.out.println("The bus number "+name+"started moving at a speed: "+speed+ " km/h."  );
    }
    public  void stop( ){
        System.out.println("The bus finished a moving. " );
    }



    public int speedUp(int speedUp) {
        speed += speedUp;
        System.out.println("The bus has speed up. Current speed: " + speed + " km/h.");
        return speedUp;
    }
    public int speedDown(int speedDown) {
        speed -= speedDown;
        System.out.println("The bus has slowed down. Current speed: " + speed + " km/h.");
        return speedDown;
}


}
//modified file in terminal
//modified file in terminal
//modified file in terminal
//modified file in terminal
//modified file in terminal
//modified file in terminal