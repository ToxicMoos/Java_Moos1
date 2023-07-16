package Lesson34.hw1.array_methods;

import Lesson34.practice.model.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class ArrayToolsTest {

    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 9, 1, 0};
        arrStr = new String[]{"kiwi", "banana", "apple", "peach", "fruit"};
        soldiers = new Soldier[]{
                new Soldier("John", 192, 72.3, 81),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 182, 63.3, 92),
                new Soldier("Mary", 159, 52.1, 91),
                new Soldier("Anna", 162, 84.0, 88)

        };
    }

    @Test
    void  testBubbleSortByComparatorInteger(){
        System.out.println("---------------------testBubbleSortByComparatorInteger----------------------------");
        ArrayTools.printArray(arrNum);
        Comparator<Integer> comparatorInteger = Comparator.comparingInt(a -> a);
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        };
        ArrayTools.bubbleSort(arrNum,comparatorInteger);
        ArrayTools.printArray(arrNum);

    }
    @Test
    void  testBubbleSortByComparatorString() {
        System.out.println("---------------------testBubbleSortByComparatorInteger----------------------------");
        ArrayTools.printArray(arrStr);
        //Comparator<String> comparatorString = (o1,o2) ->o1.compareTo(o2);
        Comparator<String> comparatorString = String::compareTo; {

//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
        ArrayTools.bubbleSort(arrStr,comparatorString);
        ArrayTools.printArray(arrStr);

        }
    }
    @Test
    void testBubbleSortByComparator() {
        System.out.println("---------------------------testSoldierByWeight------------------------------");
        ArrayTools.printArray(soldiers);
        // Сравнение солдат по весу                                                                                                 // Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Comparator<Soldier> weightComparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        };
        ArrayTools.bubbleSort(soldiers, weightComparator);
        ArrayTools.printArray(soldiers);
        // Сравнение солдат по росту
        System.out.println("---------------------------testSoldierByHeight------------------------------");
        ArrayTools.printArray(soldiers);
        Comparator<Soldier> heightComparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getHeight() - o2.getHeight();
            }
        };
        ArrayTools.bubbleSort(soldiers, heightComparator);
        ArrayTools.printArray(soldiers);
        // Сравнение солдат сначала по росту, затем по весу
        System.out.println("---------------------------testSoldierByHeightAndWeight------------------------------");
        ArrayTools.printArray(soldiers);
        Comparator<Soldier> heightAndWeightComparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int heightCompar = o1.getHeight() - o2.getHeight();
                double weightCompar =(o1.getWeight() - o2.getWeight());
                if (heightCompar != 0) {
                    return heightCompar;
                } else {
                    return (int) weightCompar;
                }
            }
        };
        ArrayTools.bubbleSort(soldiers,heightAndWeightComparator);
        ArrayTools.printArray(soldiers);
    }
    @Test
    void  testBubbleSortByComparatorIntegerXX(){
        System.out.println("---------------------testBubbleSortByComparatorInteger----------------------------");
        ArrayTools.printArray(arrNum);
        Comparator<Integer> comparatorInteger = (n1,n2) -> n1-n2;
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }

        ArrayTools.bubbleSort(arrNum,comparatorInteger);
        ArrayTools.printArray(arrNum);

    }
}