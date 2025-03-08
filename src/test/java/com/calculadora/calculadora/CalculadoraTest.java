package com.calculadora.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora soma = (a, b) -> a + b;
        assertEquals(8, soma.calcular(5, 3));
    }

    @Test
    public void testSubtracao() {
        Calculadora subtracao = (a, b) -> a - b;
        assertEquals(2, subtracao.calcular(5, 3));
    }
}
