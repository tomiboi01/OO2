package ar.edu.info.unlp.PatronesDeDiseño.ejer6;

import java.time.LocalDate;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String lugarEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private EstadoExcursion estado;
    private List<Usuario> usuario;
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public String getLugarEncuentro() {
        return lugarEncuentro;
    }
    public double getCosto() {
        return costo;
    }
    public int getCupoMinimo() {
        return cupoMinimo;
    }
    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public String darInfo()
    {
        return estado.darInfo();
    }

    public void setEstado(EstadoExcursion estado) {
        this.estado = estado;
    }

    public List<String> getUsuariosEmails()
    {
        return this.usuario.stream().map(u -> u.getEmail()).toList();
    }

    public int getCantidadInscriptos()
    {
        return this.usuario.size();
    }

    

}
