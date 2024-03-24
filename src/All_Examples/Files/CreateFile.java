package All_Examples.Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file2 = new File("myFile2");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        File file = new File("myFile1");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    }
}
// hello from Radu new update