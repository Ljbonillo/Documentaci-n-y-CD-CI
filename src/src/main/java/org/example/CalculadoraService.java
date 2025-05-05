package org.example;

/**
 * @class CalculadoraService
 * @brief Servicio que utiliza repositorios necesarios para realizar las operacios con los valores obtenidos
 */
public class CalculadoraService {

    private final Repositorio repositorio;
    
    /**
     * Constructor de la clase
     * @param repositorio Repositorio necesario para realizar la operacion y obtener los valores
     */
    public CalculadoraService(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Suma los valores proporsionados por el repositorio 
     * @return Resultado de la suma de los valores
     */
    public int sumarValores() {
        return repositorio.obtenerValorA() + repositorio.obtenerValorB();
    }

    /**
     * Suma los valores
     * @param a Primer Valor
     * @param b Segundo valor
     * @return Resultado obtenido de la operacion
     */
    public int sumarValores(int a, int b){
        return a + b;
    }
}
