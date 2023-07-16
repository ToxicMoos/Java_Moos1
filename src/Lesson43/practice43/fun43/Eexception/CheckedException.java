package Lesson43.practice43.fun43.Eexception;

public class CheckedException {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) -"проверенные исключения"  которые возникают во время компиляции
        //Unchecked (RunTime exception) - Ошибка  которые возникают во время выполнения программы


//        File files = new File("myFF");
//        try {
//            Scanner scanner = new Scanner(files);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
         int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
