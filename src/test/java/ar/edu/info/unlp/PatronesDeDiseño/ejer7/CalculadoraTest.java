package ar.edu.info.unlp.PatronesDeDiseño.ejer7;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSuma() {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.setValor(5);
        assertEquals(15.0, Double.parseDouble(calculadora.resultado()), 0.01);  

    }

    @Test
    void testResta() {
        calculadora.setValor(10);
        calculadora.menos();
        calculadora.setValor(5);
        assertEquals(5.0, Double.parseDouble(calculadora.resultado()), 0.01);  
    }

    @Test
    void testMultiplicacion() {
        calculadora.setValor(10);
        calculadora.por();
        calculadora.setValor(5);
        assertEquals(50.0, Double.parseDouble(calculadora.resultado()), 0.01);  
    }

    @Test
    void testDivision() {
        calculadora.setValor(10);
        calculadora.dividir();
        calculadora.setValor(5);
        assertEquals(2.0, Double.parseDouble(calculadora.resultado()), 0.01);  
    }
    @Test
    void testDivisionPor0() {
        calculadora.setValor(10);
        calculadora.dividir();
        calculadora.setValor(0);
        assertEquals("Error en la operación", calculadora.resultado());  
    }

    @Test
    void testBorrar() {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.setValor(5);
        calculadora.borrar();
        assertEquals(0.0, Double.parseDouble(calculadora.resultado()), 0.01);  
    }

    @Test
    void testErrorSuma()
    {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.mas();
        assertEquals("Error en la operación", calculadora.resultado());
        
    }
    @Test
    void testError2()
    {
        calculadora.setValor(10);
        calculadora.setValor(5);
        assertEquals("Error en la operación", calculadora.resultado());
    }
 

}
