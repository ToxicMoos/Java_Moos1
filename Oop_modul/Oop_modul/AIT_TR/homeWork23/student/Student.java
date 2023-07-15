package homeWork23.student;

public class Student {
    //поля класса
    String name;
    int[] marks;
   //методы класса

    public Student(String name) {
        this.name = name;
    }

    public double averageMars(int[] marks){
       double sum = 0;
       for (int i = 0; i < marks.length; i++) {
           sum= sum+marks[i]; // sum += marks[i];
       }
       return sum/marks.length;
   }
}
