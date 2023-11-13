package Lesson66.src.teacher_code;

public class Matrix3 {
    public static void main(String[] args) {
        int[][] matrix3 = { {1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9} };
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j <matrix3[i].length; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }

    }



}
