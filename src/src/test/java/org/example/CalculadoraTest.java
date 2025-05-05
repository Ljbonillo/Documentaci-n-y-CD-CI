package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }
    @Test
    void testSuma() {
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 + 3 debe ser 8");
    }
    @Test
    void testResta() {
        int resultado = calculadora.restar(10, 4);
        assertEquals(6, resultado, "La resta de 10 - 4 debe ser 6");
    }
    @Test
    void testMultiplicacion() {
        int resultado = calculadora.multiplicar(3, 7);
        assertEquals(21, resultado, "La multiplicación de 3 x 7 debe ser 21");
    }
    @Test
    void testDivision() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado, "La división de 10 / 2 debe ser 5");
    }
    @Test
    void testDivisionPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
                assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}