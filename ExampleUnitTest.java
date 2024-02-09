package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testFuncionSucesion() {

        MainActivity calculadora = new MainActivity();
        long resultado = calculadora.funcionSucesion(7);
        assertEquals(13, resultado);
    }
}