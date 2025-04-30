package ar.edu.info.unlp.PatronesDeDiseño.ejer18;
import java.time.LocalDate;

public class FileOO2 implements Component {
    private String nombre;
    private String extension;
    private int tamanio;
    private LocalDate fechaDeCreacion;
    private LocalDate fechaDeModificacion;
    
    public FileOO2(String nombre, String extension, int tamanio, LocalDate fechaDeCreacion,
            LocalDate fechaDeModificacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaDeCreacion = fechaDeCreacion;
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamanio() {
        return tamanio;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    @Override
    public String prettyPrint() {
        return "";
    }
}
