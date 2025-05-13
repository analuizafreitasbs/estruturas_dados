package Filas.Fila_Dinamica.testes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        calc.dividir(5, 0);
    }
}
