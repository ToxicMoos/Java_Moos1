package Lesson15.homeWork15_2.Lesson15_2;

//Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
// Найдите среднюю величину по всем элементам массива с четными индексами.

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public int averageVolume() {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum/2 ;
    }

    public void  info(){
        System.out.println("Average sum of positive numbers is: " + averageVolume()  );
    }

}