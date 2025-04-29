package ar.edu.info.unlp.PatronesDeDiseño.ejer14;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestPrenda {
    private Prenda prenda1;
    private Prenda prenda2;
    private PrendaCombinada prenda3;

    @BeforeEach
    public void setUp()
    {
        prenda1 = new Auto(0.8, "Toyota", 50000, 5, 20000);
        prenda2 = new Inmueble(0.5, 1000, 50, "Calle Falsa 123");
        prenda3 = new PrendaCombinada();
        prenda3.agregarPrenda(prenda1);
        prenda3.agregarPrenda(prenda2);

    }

    @Test
    public void testValorPrenda1() {
        assertEquals(15000, prenda1.getValor(), 0.01);
    }
    @Test
    public void testValorPrenda2() {
        assertEquals(50000, prenda2.getValor(), 0.01);
    }
    @Test
    public void testValorPrenda3() {
        assertEquals(65000, prenda3.getValor(), 0.01);
    }
    
}
