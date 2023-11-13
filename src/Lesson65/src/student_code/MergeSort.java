package Lesson65.src.student_code;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 1, 11, 9, 13, 10, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);
        System.out.println();
        System.out.println("sorted array:");
        mergeSort(arr);
        printArray(arr);



    }

    public static void mergeSort(int[] array) {
        // Проверяем, если массив имеет более одного элемента
        if (array.length > 1) {

            // Находим середину массива
            int middle = array.length / 2;

            // Создаем левую и правую подмассивы
            int[] left = new int[middle];
            int[] right = new int[array.length - middle];

            // Копируем элементы из исходного массива в левый и правый подмассивы

            for (int i = 0; i < middle; i++) {
                left[i] = array[i];
            }
            for (int i = middle; i < array.length; i++) {
                right[i - middle] = array[i];
            }
            // Рекурсивно сортируем левый и правый подмассивы
            mergeSort(left);
            mergeSort(right);

            // Объединяем отсортированные левый и правый подмассивы
            merge(array,left,right);

        }
    }
    // Шаг 7: Сравниваем элементы левого и правого подмассивов и объединяем их в один отсортированный массив
    public static void merge(int[] array, int[] left, int[] right){
        int i = 0, j = 0 , k = 0;
        while (i< left.length && j< right.length){
            if (left[i]< right[j]){
                array[k++] = left[i++];
            }else {
                array[k++] = right[j++];
            }
        }
        // Шаг 8: Добавляем оставшиеся элементы из левого подмассива

        while (i< left.length){
            array[k++] = left[i++];
        }
        // Шаг 9: Добавляем оставшиеся элементы из правого подмассива
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + "  " );
        }
        System.out.println();
    }
}

