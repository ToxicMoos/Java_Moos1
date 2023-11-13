package Lesson65.src.student_code;
import java.util.Arrays;
public class BubbleSort3 {
    public static void main(String[] args) {
        int[] arr = {87, -1, 92, 6, -15, 22, 31, -48, 54, 16};
        for (int i = 0; i < arr.length; i++)  {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted){
                break;
            }
            System.out.println((i+1)+": "+Arrays.toString( arr));
        }
    }
}




