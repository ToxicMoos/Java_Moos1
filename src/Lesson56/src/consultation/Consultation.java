package Lesson56.src.consultation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Consultation {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Do");
        arrayList.add("Re");
        arrayList.add("Mi");
        List<String> immutable = List.of("one ","two","three");
        System.out.println(immutable);

        List<String> becameImmutable = Collections.unmodifiableList(arrayList);
        System.out.println("becameImmutable"+ becameImmutable);

        Scanner scanner = new Scanner(System.in);





    }
    public static void readFile(){
        File file = new File("Lesson56/src/consultation/FF.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader,2);

            System.out.println(bufferedReader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
