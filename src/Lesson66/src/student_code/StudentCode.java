package Lesson66.src.student_code;

public class StudentCode {
    public static void main(String[] args) {
        int[] num  = {12, 3,  8, 55, 20, 36, -47,1, 68};

        int min = num[0];


        for (int i = 1; i < num.length ; i++) {
            if ( num[i] < min){
                min=num[i];

            }
        }
        System.out.println(min);




    }
}
