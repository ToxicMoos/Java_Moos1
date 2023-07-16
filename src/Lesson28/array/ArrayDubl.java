package Lesson28.array;

public class ArrayDubl {

    //Switch case
//        for (int num:arr) {
//            System.out.println(num);
//            switch (num){    //  Используем switch case для определения числа и увеличения счетчика повторений
//                case 1: count[1]++;
//                break;
//                case 2: count[2]++;
//                    break;
//                case 3: count[3]++;
//                    break;
//                case 4: count[4]++;
//                    break;
//                case 5: count[5]++;
//                    break;
//                case 6: count[6]++;
//                    break;
//                case 7: count[7]++;
//                    break;
//                case 8: count[8]++;
//                    break;
//                case 9: count[9]++;
//                    break;
//                case 10: count[10]++;
//                    break;
//
//            }
//
//        }
        // Выводим результаты для каждого числа от 1 до 10

        //без Switch case

    //methods
    static void check(int[] num) {
        for (int i = 1; i < num.length; i++) {
            if (num[i] == 0 || num[i] == 1) {
                continue;
            } else
                System.out.println("The number ["+ i + "] repeated " + num[i] + " times.");
        }
    }
    static int[]  duplicate( int[] arr) {
        int[] count = new int[arr.length];//создаем пустой массив count, по длине массива arr
        for (int num : arr) {
            if (num >= 1 && num <= 10) {//// Проверяем, что число num входит в диапазон от 1 до 10
                count[num]++;//заполняем count ,массивом num(arr) по индексу
             }
        }
        return count;
    }
}



