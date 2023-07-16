package Lesson44.homeWork44;
import java.util.Arrays;
import java.util.Arrays;

public class BinarySearch {

        int[] arr  = {1,2,3,4,5};






    public static int binarySearch(int[] array,int key){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,key);
        index = index >= 0 ? index : -index -1;
        return index;
    }
}



