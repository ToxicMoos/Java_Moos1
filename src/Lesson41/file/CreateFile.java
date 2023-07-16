package Lesson41.file;


import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args) {
        try {//В коде try блок содержит код, который создает файл и проверяет, удалось ли это.
            // Если возникнет ошибка ввода-вывода (IOException), код перейдет к блоку catch, где вы предоставляете обработку этого исключения.
            File myObject = new File("SheinFile.txt");
            if (myObject.createNewFile()){
                System.out.println("File created:" + myObject.getName());
            }else {
                System.out.println("File already exists");
            }

    }catch (IOException ex) {
            System.out.println("An error occurred"); //Произошла ошибка
            ex.printStackTrace();//Метод printStackTrace() позволяет разработчику быстро определить, где исключение произошло, путем вывода полной информации о стеке вызовов на консоль.

        }

}
}
