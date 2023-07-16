package Lesson29.practicShapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;//создал объект
    @BeforeEach
    void setUp() {
        square = new Square(10);
    }

    @Test
    void calcArea() {
        double a = 10 * 10;
        double b = square.calcArea();
        assertTrue(100==b);
    }

    @Test
    void calcPerimeter() {
        double a = 4 * 10;
        double b = square.calcPerimeter();
        assertTrue(a==b);
    }
}