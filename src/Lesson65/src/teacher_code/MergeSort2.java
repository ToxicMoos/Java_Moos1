package Lesson65.src.teacher_code;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr ={66,12,4,98,-10,23,35,-7,50,0};
        System.out.println("Original array");
        printArray(arr);


        System.out.println("sorted array");
        mergeSort(arr);
        printArray(arr);

    }
    public static void mergeSort(int[] array){
        if (array.length > 1){
            int middle = array.length / 2;
            int[] left = new int[middle];
            int[] right = new int[array.length-middle];

            for (int i = 0; i < middle; i++) {
                left[i] = array[i];
            }
            for (int i = middle; i < array.length ; i++) {
                right[i-middle] = array[i];
            }
        //sorting left and fight
            mergeSort(left);
            mergeSort(right);

        //merge all arrays
            merge(array,left,right);


        }
    }
    public static void merge(int[] array, int[] left, int[]right){
        int i = 0, j = 0, k = 0;
        while (i< left.length && j< right.length){
            if (left[i]< right[j]){
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        // Шаг 8: Добавляем оставшиеся элементы из левого подмассива
        while (i < left.length){
            array[k++]= left[i++];
        }
        while (j< right.length){
            array[k++] = right[j++];
        }
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
