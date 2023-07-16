package Lesson43.practice43.fun43.Eexception;

import java.io.IOException;
import java.text.ParseException;

public class MethodException {
    public static void main(String[] args)   {

        try {
            run();
        } catch (IOException | ParseException e) { //multi catch
            e.printStackTrace();
        }




    }
public static void run() throws IOException, ParseException,IllegalArgumentException {

    }
}
