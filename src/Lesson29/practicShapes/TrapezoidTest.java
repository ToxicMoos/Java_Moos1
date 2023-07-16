package Lesson29.practicShapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid;


    @BeforeEach
    void setUp() {
        trapezoid = new Trapezoid(5,7,3,4,3);
    }

    @Test
    void calcArea() {
        double a = ((5 + 7) * 3) / 2;
        double b = trapezoid.calcArea();
        assertTrue(a==b);

    }

    @Test
    void calcPerimeter() {
        double a = 4+5+6+4;
        double b = trapezoid.calcPerimeter();
        assertTrue(a==b);
    }
}