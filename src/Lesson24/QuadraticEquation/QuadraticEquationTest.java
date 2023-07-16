package Lesson24.QuadraticEquation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    QuadraticEquation quadraticEquation;    //поле класса

    @BeforeEach//предоставляет возможность использовать аннотацию @BeforeEach, чтобы инициализировать объект перед каждым тестом вместо повторения кода инициализации в каждом тестовом методе
    void setUp() {
        quadraticEquation = new QuadraticEquation(2.0,-5.0,-3.0);//// Здесь можно инициализировать quadraticEquation с нужными значениями коэффициентов
    }

    @Test
    public void positiveDiscriminantTest() {
        QuadraticEquation equation = new QuadraticEquation(2.0, -5.0, -3.0);
        Double[] expected = {3.0,-0.5};
//        Double[] actual   = equation.solution1();
        assertArrayEquals(expected,equation.solution1());
        // Ожидаемые результаты: уравнение имеет два корня
        // Корень 1: 3.0
        // Корень 2: -0.5e
    }

    @Test
    public void zeroDiscriminantTest() {
        QuadraticEquation equation = new QuadraticEquation(1.0, -4.0, 4.0);
        Double[] expected = {2.0};
        assertArrayEquals(expected,equation.solution1());
        // Ожидаемые результаты: уравнение имеет один корень
        // Корень1: 2.0
    }

    @Test
    public void negativeDiscriminantTest() {
        QuadraticEquation equation = new QuadraticEquation(3.0, 2.0, 5.0);
        Double[] expected = {};
        assertArrayEquals(expected,equation.solution1());
        // Ожидаемые результаты: уравнение не имеет вещественных корней
    }
}