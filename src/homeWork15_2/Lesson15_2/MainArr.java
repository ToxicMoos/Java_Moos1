package homeWork15_2.Lesson15_2;

public class MainArr {
    public static void main(String[] args) {
        //Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        // Найдите среднюю величину по всем элементам массива с четными индексами.
        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        Array arrayNums = new Array(numbers);

        arrayNums.info();
    }
}

