package Lesson29.practicShapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void calcArea() {
        double a = Math.PI * 10 * 10;    // 314.1592653589793
        double b = circle.calcArea();
        assertTrue(a==b);
    }

    @Test
    void calcPerimeter() {
        double a = 62.83185307179586;  //2 * Math.PI *10;
        double b = circle.calcPerimeter();
        assertTrue(a==b);
    }
}