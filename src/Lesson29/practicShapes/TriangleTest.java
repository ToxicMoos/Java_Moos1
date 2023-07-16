package Lesson29.practicShapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(13,14,15);
    }

    @Test
    void calcArea() {
        double p = (13+14+15)/2; //21
        double area = Math.sqrt(p* (p-13)* (p-14)* (p-15));//84.0
        double c = triangle.calcArea();
        assertTrue(area == c);
    }

    @Test
    void calcPerimeter() {
        double a = 13 + 14 + 15;   // 42
        double b = triangle.calcPerimeter();
        assertTrue(a == b);
    }
}