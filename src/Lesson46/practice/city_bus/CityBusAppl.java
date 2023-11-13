package Lesson46.practice.city_bus;

import Lesson46.practice.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        //создадим список городских маршрутов
        //вывести на печать в отсортированном виде
        //Подсчитать общее кол-во пасс-ров за день

        List <Bus> cityBuses = new ArrayList<Bus>();


        cityBuses.add(new Bus("Scania","2000AG","M1",90));
        cityBuses.add(new Bus("Man","1000AG","A8",95));
        cityBuses.add(new Bus("Mercedes","3000AG","X37",100));
        cityBuses.add(new Bus("Ikarus ","5000AG","B63",80));

        System.out.println(cityBuses.equals(cityBuses));

        for (Bus x: cityBuses ) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------------------------------------");

        cityBuses.sort(Bus::compareTo);
        for (Bus x: cityBuses ) {
            System.out.println(x);
        }
        System.out.println("----------------------Total Capacity----------------------------------");

        int totalCapacity = 0;
        for (Bus bus : cityBuses) {
            totalCapacity += bus.getCapacity();
        }    System.out.println(totalCapacity);

        System.out.println("------------------------------------------------------------------------");

        Bus busTiEdit = cityBuses.get(1);

        busTiEdit.setModel("Ykarus");
        System.out.println(busTiEdit);

        for (Bus x: cityBuses ) {
            System.out.println(x);
        }





    }
}
