package Lesson35.hw1_Cats.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CatTest {
    Cat[] cats;    //массив из объектов типа Cat, любой созданный нами Class,- это новый ,определённый нами, ТИП данных

    @BeforeEach
    void setUp() {
        cats = new Cat[]{
                new Cat("Tom",7,"Black",7.6),
                new Cat("Murzik",3,"Gray",3.1),
                new Cat("Choko",2 ,"Braun",1.5),
                new Cat("Barsik",5,"Red",5.7),
                new Cat("Avalon",4,"White",4.8),
                new Cat("Diesel",6,"Orange",2.4),
        };
    }




    @Test
    void catSortTestName(){

        printArray(cats,"-----Cats unsorted------");//unsorted
        Arrays.sort(cats);  //подвергаем сортировке !!!
        System.out.println();
        printArray(cats,"-----Cats sorted by age-----");
    }
    @Test
    void testBinarySearch(){
        // бинарный поиск работает ТОЛЬКО с ОТСОРТИРОВАННЫМ МАССИВОМ
        // печать массива как есть
        printArray(cats,"-------------Original array---------------");
        // сортировка компаратором по весу
        Comparator<Cat> catComparator = Comparator.comparing(Cat :: getWeight);
        Arrays.sort(cats,catComparator);
        printArray(cats,"--------------Sorting by weight-----------------");
        // поиск BinarySearch существующего элемента
        Cat pattern1 = new Cat("",4.8);
        int index1 = Arrays.binarySearch(cats,pattern1,catComparator);
        System.out.println("index = "+index1);
        // поиск BinarySearch НЕсуществующего элемента
        Cat pattern2 = new Cat("",9.1);
        int index2 = Arrays.binarySearch(cats,pattern2,catComparator);
        System.out.println("index = "+index2);





                
            }












    //-----------Methods-------------
    public void printArray(Object[] arr,String title){
        System.out.println("-----------"+title+"---------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }


}