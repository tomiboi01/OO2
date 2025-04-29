package ar.edu.info.unlp.PatronesDeDiseño.ejer11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.PatronesDeDiseño.ejer12.Archivo;
import ar.edu.info.unlp.PatronesDeDiseño.ejer12.Directorio;
import ar.edu.info.unlp.PatronesDeDiseño.ejer12.FileSystemElement;

public class FileSystemElementTest {
    private FileSystemElement file1;
    private FileSystemElement file2;
    private FileSystemElement file3;
    private Directorio folder1;
    private Directorio folder2;
    private Directorio folder3;
    private Directorio carpetaVacia;
    private Directorio folder4;

    @BeforeEach
    void setUp() {
        file1 = new Archivo("file2.txt", LocalDate.of(2023, 1, 1), 100);
        file2 = new Archivo("file2.txt", LocalDate.of(2023, 1, 2), 200);
        file3 = new Archivo("file3.txt", LocalDate.of(2023, 1, 3), 300);
        folder1 = new Directorio("folder1", LocalDate.of(2023, 1, 4));
        folder2 = new Directorio("folder2", LocalDate.of(2023, 1, 5));
        folder3 = new Directorio("folder3", LocalDate.of(2023, 1, 6));
        carpetaVacia = new Directorio("folder4", LocalDate.of(2023, 1, 7));
        folder4 = new Directorio("folder4", LocalDate.of(2023, 1, 8));
        folder1.agregarElemento(file1);
        folder1.agregarElemento(file2);
        folder2.agregarElemento(file3);
        folder3.agregarElemento(folder1);
        folder3.agregarElemento(folder2);
        folder3.agregarElemento(folder4);
        folder4.agregarElemento(carpetaVacia);
        
    }

    @Test
    public void testTamanoTotalOcupado() {
        assertEquals(100, file1.tamanoTotalOcupado());
        assertEquals(200, file2.tamanoTotalOcupado());
        assertEquals(1024*32 + 100 + 200, folder1.tamanoTotalOcupado());
        assertEquals(1024*32 + 300, folder2.tamanoTotalOcupado());
        assertEquals(1024*32*3 + 100 + 200 + 300, folder3.tamanoTotalOcupado());
    }
    @Test
    public void testArchivoMasGrande() {
        assertEquals(file2, folder1.archivoMasGrande2());
        assertEquals(file3, folder2.archivoMasGrande2());
    }

    @Test
    public void testArchivoMasGrandeCasoDirectorioVacio()
    {
        assertEquals(null, carpetaVacia.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo() {
        assertEquals(file1, folder3.archivoMasNuevo2());

    }

    @Test
    public void testArchivoMasNuevoCasoDirectorioVacio()
    {
        assertEquals(null, carpetaVacia.archivoMasNuevo());
    }

    @Test
    public void testBuscar() {
        assertEquals(file1, folder3.buscar("file2.txt"));
        assertNotEquals(file2, folder3.buscar("file2.txt"));
        assertEquals(file3, folder3.buscar("file3.txt"));
        assertEquals(folder1, folder3.buscar("folder1"));
        assertEquals(folder2, folder3.buscar("folder2"));
        assertEquals(folder3, folder3.buscar("folder3"));

    }

    @Test
    public void testBuscarTodos() {
        // assertEquals(0, folder1.buscarTodos("file1.txt").size());
        // assertEquals(2, folder1.buscarTodos("file2.txt").size());
        // assertEquals(1, folder2.buscarTodos("file3.txt").size());
        // assertEquals(1, folder3.buscarTodos("folder1").size());
        // assertEquals(1, folder3.buscarTodos("folder2").size());
        List<FileSystemElement> resultado = folder3.buscarTodos("folder4");
        assertEquals(2, resultado.size());
        System.out.println(folder3.buscarTodos("file2.txt").size());
    }


}