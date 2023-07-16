package Lesson34.practice.array_methods;

import Lesson34.practice.model.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9,7,4,7,2,5,9,1,0};
        arrStr = new String[]{"one","two","three","four","five"};
        soldiers = new Soldier[]{
                new Soldier("John",182,82.3,91),
                new Soldier("Peter",175,77.1,75),
                new Soldier("Robin",162,69.3,82),
                new Soldier("Mary",159,55.1,91),
                new Soldier("Anna",169,55,88)
        };
    }

    @Test
    void testPrintArray() {
        System.out.println("--------------testPrintArray------------------");

        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSearchIndex() {
        System.out.println("----------------testSearchIndex-----------------");
        //для целых чисел

        Integer res = ArrayTools.searchIndex(arrNum,5);
        ArrayTools.printArray(arrNum );
        System.out.println("индекс в массиве = "+res);
        assertEquals(5,res);
        assertEquals(-1,ArrayTools.searchIndex(arrNum,55));//-1 = несуществующие числа,55
        //для строки

        ArrayTools.printArray(arrStr);
        int index =ArrayTools.searchIndex(arrStr,"two");
        assertEquals(1,index);
        assertEquals(-1,ArrayTools.searchIndex(arrStr,"six"));
        //для Soldiers

        ArrayTools.printArray(soldiers);
        int index2 =ArrayTools.searchIndex(soldiers, new Soldier("Peter",175,77.1,75));
        assertEquals(1,index2);
        assertEquals(-1,ArrayTools.searchIndex(soldiers, new Soldier("Rambo",175,77.1,75)));//Rambo  несуществуюет

    }

    @Test
    void searchBoolean() {
    }

    @Test
    void TestFindByPredicate() {
        System.out.println("-------------TestFindByPredicate----------------");
        //для целых чисел

        ArrayTools.printArray(arrNum);
        Integer res =ArrayTools.findByPredicate(arrNum,n -> n<8);//
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum,n -> n%5 == 0);
        System.out.println(res);
        //для строки

        ArrayTools.printArray(arrStr);
        String str = ArrayTools.findByPredicate(arrStr, s  ->  s == "two");
        System.out.println(str);
        assertEquals("two",str);
        String str1 = ArrayTools.findByPredicate(arrStr, s  ->  s.length() == 5);
        System.out.println(str1);
        //для Soldiers
        ArrayTools.printArray(soldiers);
        Soldier sold = ArrayTools.findByPredicate(soldiers, soldier1 ->  soldier1.getHeight() <180 );
        System.out.println(sold);
        assertEquals(soldiers[1],sold);

    }
    @Test
    void TestBubbleSort(){
        System.out.println("---------------TestBubbleSort----------------------");
        ArrayTools.printArray(soldiers);
        Arrays.sort(soldiers,(s1,s2) -> s1.getName().compareTo(s2.getName()));
        Comparator<Soldier> comparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getName().compareTo(o2.getName());

            }
        };
        ArrayTools.bubbleSort(soldiers,comparator);
        ArrayTools.printArray(soldiers);

    }
}