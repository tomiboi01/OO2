package ar.edu.info.unlp.PatronesDeDiseño.ejer11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystemElement{
    private List<FileSystemElement> elementos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new java.util.ArrayList<>();
    }
    public void agregarElemento(FileSystemElement elemento) {
        this.elementos.add(elemento);
    }
    
    @Override
    public int tamanoTotalOcupado() {
        return 1024*32 + this.elementos.stream().mapToInt(a -> a.tamanoTotalOcupado()).sum();}

    @Override
    public Archivo archivoMasGrande() {

        return this.elementos.stream()
                .map(e -> e.archivoMasGrande())
                .filter(a -> a != null)
                .max(new ComparadorTamañoElemento())
                .orElse(null);

    }

    public Archivo archivoMasGrande2()
    {
        Archivo archivoMax = null;
        int tamañoMax = Integer.MIN_VALUE;
        for (FileSystemElement elemento : this.elementos) {
            Archivo archivo = elemento.archivoMasGrande2();
            if (archivo != null && archivo.tamanoTotalOcupado() > tamañoMax) {
                tamañoMax = archivo.tamanoTotalOcupado();
                archivoMax = archivo;
            }
        }
        return archivoMax;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.elementos.stream()
                .map(e -> e.archivoMasNuevo())
                .filter(a -> a != null)
                .min(new ComparadorFechaElemento())
                .orElse(null);
        }

    public Archivo archivoMasNuevo2()
    {
        Archivo archivoMin = null;
        LocalDate fechaMin = LocalDate.MAX;
        for (FileSystemElement elemento : this.elementos) {
            Archivo archivo = elemento.archivoMasNuevo2();
            if (archivo != null && archivo.getFechaCreacion().isBefore(fechaMin)) {
                fechaMin = archivo.getFechaCreacion();
                archivoMin = archivo;
            }
        }
        return archivoMin;
    }
    
    // private Archivo archivoComparadoPor(Comparator<FileSystemElement> comparador) {
    //     return this.elementos.stream()
    //             .map(e -> e.archivoComparadoPor(comparador))
    //             .filter(a -> a != null)
    //             .max(comparador)
    //             .orElse(null);
    // }
    

    @Override
    public FileSystemElement buscar(String nombre) {
        if (this.nombre.equals(nombre))
            return this;

        return this.elementos.stream()
                .map(e -> e.buscar(nombre))
                .filter(e -> e != null)
                .findFirst()
                .orElse(null);

        // if (this.nombre.equals(nombre)) {
        //     return this;
        // }
        // for (FileSystemElement elemento : this.elementos) {
        //     FileSystemElement encontrado = elemento.buscar(nombre);
        //     if (encontrado != null) {
        //         return encontrado;
        //     }
        // }
        // return null;
    }

    @Override
    public List<FileSystemElement> buscarTodos(String nombre) {
       
        List<FileSystemElement> resultado = new ArrayList<FileSystemElement>();
        if (this.nombre.equals(nombre)) {
            resultado.add(this);
        }
            resultado.addAll(this.elementos.stream()
                .map(e -> e.buscarTodos(nombre))
                .filter(e -> e != null)
                .flatMap(e -> e.stream())
                .toList());
        
        return resultado;
    }

    @Override
    public String listadoDeContenido() {
        String resultado = this.nombre + "\r\n";
        for (FileSystemElement elemento : this.elementos) {
            resultado += this.nombre + elemento.listadoDeContenido() + "\r\n";
        }
        return resultado;
    }
    
}
