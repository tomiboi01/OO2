package ar.edu.info.unlp.PatronesDeDiseño.ejer18;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestComponent {
    private Decorator decoratorNombre;
    private Decorator decoratorTamano;
    private Decorator decoratorFechaCreacion;
    private FileOO2 file1;

    @BeforeEach
    public void setUp() {
        file1 = new FileOO2("file1",".txt", 100, LocalDate.of(2025, 1, 1), LocalDate.now());
        decoratorFechaCreacion = new ConcreteDecoratorFechaCreacion(file1, file1);
        decoratorTamano = new ConcreteDecoratorTamanio(file1, decoratorFechaCreacion);
        decoratorNombre = new ConcreteDecoratorNombre(file1, decoratorTamano);
        
    }

    @Test
    void testPrettyPrintNombreTamanioFechaCreacion()
    {
        String expected = "Nombre: file1, Tamaño: 100, Fecha de creación: 2025-01-01, ";
        String result = decoratorNombre.prettyPrint();
        assertEquals(expected, result);
    }

    
}
