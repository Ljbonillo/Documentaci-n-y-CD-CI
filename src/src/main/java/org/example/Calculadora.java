package org.example;
/**
 * @class Calculadora
 * @brief Clase que implementa operacions matematicas basicas
 */
public class Calculadora {

    /**
     * 
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return resultado de la operacion
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * @param a Minuendo 
     * @param b Sustraendo
     * @return Resultado de la operacion
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * 
     * @param a Primer factor
     * @param b Segundo factor
     * @return Resultado de la operacion
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * 
     * @param a Dividendo
     * @param b Divisor
     * @throws ArithmeticException si el divisor es por cero
     * @return resultado de la operacion
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
