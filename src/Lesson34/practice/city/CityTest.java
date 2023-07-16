package Lesson34.practice.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    //вызвать тестируемый класс
    City[] city;

    @BeforeEach
    void setUp() {

        //создать тестовый набор данных
         city = new City[10];
        city[0] = new City("Berlin",36450 ,60,"13595");
        city[8] = new City("Berlin",3600000,20,"13000");
        city[1] = new City("Munchen",1645000,45,"86523");
        city[2] = new City("Bamberg",400000,35,"96138");
        city[3] = new City("Augsburg",360500,65,"86356");
        city[4] = new City("Hennef",46114,30,"53773");
        city[5] = new City("New York",8800000,90,"1001");
        city[6] = new City("Moscow",150000 ,70,"141000");
        city[7] = new City("Moscow",15000000,40,"110005");
        city[9] = new City("Moscow",15000000,10,"110005");


    }
    @Test
    void testSort(){
        System.out.println("-----Array as is------");
        printArray(city);
        System.out.println();
        Arrays.sort(city);
        System.out.println("-----Array is sorted------");
        printArray(city);
    }

    @Test
    void testSortComparator(){
        System.out.println("-----Array as is------");
        printArray(city);

        Comparator<City> cityComparator = new Comparator<City>() {//он определяет способ сортировки
            @Override
            public int compare(City o1, City o2) {
                int compareName = o1.getName().compareTo(o2.getName());
                int comparePopulation= -(o1.getPopulation() - o2.getPopulation());//по размеру популяции(с минусом, обратный порядок)
                if (compareName != 0){
                    return compareName;

                }else if (comparePopulation != 0){
                    return comparePopulation;
                }else {
                    return o1.getPollution() - o2.getPollution();//по загрязнению, меньше значения - выше
                }


            }
        };

        Arrays.sort(city,cityComparator);//аыбираем другой метод класса Arrays (2 arguments)
        System.out.println("------------------Array  sorted-----------------------");
        printArray(city);
    }
    static void printArray(Object[] array){
        for (Object name  : array){
            System.out.println(name);
        }
    }
}