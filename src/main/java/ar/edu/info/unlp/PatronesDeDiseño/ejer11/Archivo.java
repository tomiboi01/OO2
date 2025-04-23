package ar.edu.info.unlp.PatronesDeDiseño.ejer11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystemElement{

    public Archivo(String nombre, LocalDate fechaCreacion, int tamanoBytes) {
        super(nombre, fechaCreacion);
        this.tamanoBytes = tamanoBytes;
        //TODO Auto-generated constructor stub
    }


    private int tamanoBytes;
    @Override
    public int tamanoTotalOcupado() {
        return this.tamanoBytes;}

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public FileSystemElement buscar(String nombre) {
        return this.nombre.equals(nombre) ? this : null;    
    }

    @Override
    public List<FileSystemElement> buscarTodos(String nombre) {
        List<FileSystemElement> resultado = new ArrayList<FileSystemElement>();
        if (this.nombre.equals(nombre)) {
            resultado.add(this);
        }
        return resultado;
    }


    @Override
    public String listadoDeContenido() {
        return this.nombre+"\r\n";
    }

}
