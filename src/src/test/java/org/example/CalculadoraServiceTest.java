package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculadoraServiceTest {
    @Mock
    private Repositorio repositorio;
    //Esto inserta el Mock anterior como parámetro en el constructor de CalculadoraServ
    @InjectMocks
    private CalculadoraService calculadoraService;
    @Test
    void testSumarValores() {
        when(repositorio.obtenerValorA()).thenReturn(5);
        when(repositorio.obtenerValorB()).thenReturn(3);
        int resultado = calculadoraService.sumarValores();
        assertEquals(8, resultado);
    }
}