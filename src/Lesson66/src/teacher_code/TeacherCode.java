package Lesson66.src.teacher_code;


public class TeacherCode {
    public static void main(String[] args) {
        int[] arr = {23,11,99,-50,67,1,-9,46};
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]< min){
                min = arr[i];
            }

        }
        System.out.println(min);

    }



}