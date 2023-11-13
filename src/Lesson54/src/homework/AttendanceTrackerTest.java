package Lesson54.src.homework;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AttendanceTrackerTest {
    AttendanceTracker student;


    @BeforeEach
    void setUp() {
        student = new AttendanceTracker();


        student.addStudent("John");
        student.addStudent("Ketty");

        student.addLessonDate(LocalDate.of(2023,8,11));
        student.addLessonDate(LocalDate.of(2023,11,13));

        student.markAttendance("John",LocalDate.of(2023,8,11),true);
        student.markAttendance("John",LocalDate.of(2023,11,13),false);
        student.markAttendance("Ketty",LocalDate.of(2023,8,11),true);
        student.markAttendance("Ketty",LocalDate.of(2023,11,13),false);

    }

    @Test
    void addStudent() {


    }

    @Test
    void addLessonDate() {
    }

    @Test
    void markAttendance() {

    }

    @Test
    void printAllAttendance() {
    }

    @Test
    void printStudentAttendance() {
    }
}