package Lesson56.src.student_code;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentCode {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer>listForLoop = new ArrayList<>();
         List<Integer>listForStream = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            // ожидаем увидеть тут логику
            int y = list.get(i) * list.get(i);
            listForLoop.add(i);
        }

        // конвейерные операции не будут выполнены если нет терминальной
        list.stream().map(y -> y * y);
        listForStream =list.stream()
                .map(y -> y * y)
                .collect(Collectors.toList()) ;




        System.out.println("listForLoop"+listForLoop);
        System.out.println("listForStream"+listForStream);
        System.out.println("listForStream class name"+listForStream.getClass().getSimpleName());



    }
}

