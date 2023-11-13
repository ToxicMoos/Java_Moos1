package Lesson66.src.student_code;

public class Matrix2 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = { {1,2,3,4,5} , {6,7,8,9,0}, {11,44,33,66,88}    };

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(matrix2[2][4]);




    }
}
