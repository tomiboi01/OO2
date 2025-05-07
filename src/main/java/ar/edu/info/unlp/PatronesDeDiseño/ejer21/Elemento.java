package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import java.time.LocalDate;
import java.util.Date;

public abstract class Elemento {
    protected String identificador;
    protected String especie;
    protected LocalDate fechaNacimiento;

    public Elemento(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador()
    {
        return identificador;
    }
    public String getEspecie()
    {
        return especie;
    }
    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public abstract Elemento getPadre();
    public abstract Elemento getMadre();
    public abstract Elemento getAbueloPaterno();
    public abstract Elemento getAbueloMaterno();
    public abstract Elemento getAbuelaPaterna();
    public abstract Elemento getAbuelaMaterna();
    public abstract boolean tieneComoAncestroA(Elemento elemento);


    

    
}
