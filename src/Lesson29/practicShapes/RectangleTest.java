package Lesson29.practicShapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(10,5);
    }

    @Test
    void calcArea() {
        double a = 10 * 5;   //50.0
        double b = rectangle.calcArea();
        assertTrue(a==b);
    }

    @Test
    void calcPerimeter() {
        double a =  2*(10 + 5); //30.0
        double b = rectangle.calcPerimeter();
        assertTrue(a==b);

    }
}