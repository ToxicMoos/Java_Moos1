package Lesson32.practice.cats;

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
                new Cat("Barsik",5,"Red",5.7)
        };
    }


    @Test
    void catSortTestAge(){
        System.out.println("-----Cats unsorted------");//несортируемые
        printArray(cats);
        Arrays.sort(cats);  //подвергаем сортировке !!!
        System.out.println();
        System.out.println("-----Cats sorted by age-----");
        printArray(cats);


    }

    @Test
    void catSortTestName(){
        System.out.println("-----Cats unsorted------");//несортируемые
        printArray(cats);
        Arrays.sort(cats);  //подвергаем сортировке !!!
        System.out.println();
        System.out.println("-----Cats sorted by name-----");
        printArray(cats);
    }

    @Test
    void catSortTestNameAndAge(){
        System.out.println("-----Cats unsorted------");//несортируемые
        printArray(cats);
        Arrays.sort(cats);  //подвергаем сортировке !!!
        System.out.println();
        System.out.println("-----Cats sorted by Name And Age-----");
        printArray(cats);
    }

    @Test
    void catSortComporator(){
        System.out.println("-----Cats unsorted------");//несортируемые
        printArray(cats);
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return (int) (o1.getWeight()-o2.getWeight());
            }
        };
        Arrays.sort(cats,catComparator);//сортировка с помощью catComparator
        System.out.println("-----Cats sorted by weight-----");
        printArray(cats);
    }
    //-----------Methods-------------
    public void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }


}