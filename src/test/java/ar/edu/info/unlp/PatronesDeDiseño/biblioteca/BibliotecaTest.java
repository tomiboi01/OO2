package ar.edu.info.unlp.PatronesDeDiseño.biblioteca;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class BibliotecaTest {
    private Socio socio1;
    private Socio socio2;
    private Socio socio3;
    private Biblioteca biblioteca;

    @BeforeEach
    void setUp ()
    {
        socio1 = new Socio("rodrigo", "rodriguez", "12");
        socio2 = new Socio("john", "johnson", "13");
        socio3 = new Socio("martin", "martinez", "14");
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        biblioteca.agregarSocio(socio3);

    }

    @Test
    public void testExportarSocios ()
    {
        String socios = biblioteca.exportarSocios();
        System.out.println(socios);
    }


}
