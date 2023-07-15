package homeWork23.exersice1;
import java.util.Random;

public class ArrMethodAppl {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i]= random.nextInt(21)-10;
        }
    ArrayMethod arrayMethod = new ArrayMethod();   // Создаем экземпляр(объект) класса ArrayMethod

        ArrayMethod.printArray(array);
        System.out.println();
        System.out.println("positive numbers in : "+arrayMethod.positiveNumbers(array));
        System.out.println("negative numbers in : "+arrayMethod.negativeNumbers(array));
        System.out.println("events numbers in : "+arrayMethod.eventNumbers(array));
        System.out.println("Zero numbers in : "+arrayMethod.zeroNubbers(array));

    }
}
