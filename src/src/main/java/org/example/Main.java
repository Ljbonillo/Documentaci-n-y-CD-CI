package org.example;

/**
 * @class Main
 * @brief Clase principal de la aplicasción 
 */

public class Main {

    /**
     * Metodo principal, Imprime un Saludo y una secuencia de el 1 Al 5
     * @param args Argumentos de linea de comando
     */
    public static void main(String[] args) {
        
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            
            System.out.println("i = " + i);
        }
    }
}