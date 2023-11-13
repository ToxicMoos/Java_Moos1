package Lesson62.src.homework;

public class FunBubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,-2, -8, 100, 53, 84, 15, 77, 13, 49, 21};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " | ");
        }
    }
}
