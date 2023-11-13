import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LessonXXX_English {
    public static void main(String[] args) {
        String[] array = {"Я люблю","он любит","Я не люблю" ,"Она не любит","Любишь ли ты?","Любит ли она?","Она будет любить","Будем ли мы любить?","Они не будут любить","он любил","мы не любили","любила ли она?"};
        List<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
              list.stream().collect(Collectors.toList());
            }
        });

        thread.start();
        System.out.println(Thread.currentThread().getName());


    }
}
