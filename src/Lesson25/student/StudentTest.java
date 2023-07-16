//package HomeWork25.student;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentTest {
//    private String[] students;
//    private Student student;
//
//
//    @BeforeEach
//    void setUp() {
//        students = new  String[]  {"Tom", "Bil", "Arnold", "Kianu", "Angelina", "King", "Bread", "Kirk", "Uchura", "Pit","Rambo"};
//        student = new Student();
//    }
//
//    @Test
//    void distributeStudents1() {
//        String[] group1 = Student.distributeStudents1(students);
//        assertNotNull(group1);//Если утверждение assertNotNull(group1) не выполняется, то тест будет неудачным и будет выброшено исключение AssertionError.
//        assertEquals(5, group1.length);
//        assertArrayEquals(new String[]{"Pit", "Bread", "Arnold", "King", "Tom"}, group1);
//    }
//
//
//    @Test
//    void distributeStudents2() {
//        int groupSize = 5;
//        String[] group2 = Student.distributeStudents2(students, groupSize);
//
//        assertNotNull(group2);
//        assertEquals(6, group2.length);
//        assertArrayEquals(new String[]{"Kianu", "Angelina", "Uchura", "Arnold", "Bil", "Rambo"}, group2);
//    }
//    }
