package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import java.time.LocalDate;

public class Mamifero implements MamiferoInterfaz {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private MamiferoInterfaz padre;
    private MamiferoInterfaz madre;


    
    public Mamifero() {
    }


    public Mamifero(String identificador) {
        this.identificador = identificador;
    }


    public String getIdentificador() {
        return identificador;
    }
    public String getEspecie() {
        return especie;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Mamifero getPadre() {
        return padre;
    }
    public Mamifero getMadre() {
        return madre;
    }
    public Mamifero getAbueloPaterno() {
        return padre != null ? this.padre.getPadre() : null;

    }
    public Mamifero getAbueloMaterno() {
        return madre != null ? this.madre.getPadre() : null;
    }
    public Mamifero getAbuelaPaterna() {
        return padre != null ? this.padre.getMadre() : null;
    }
    public Mamifero getAbuelaMaterna() {
        return madre != null ? this.madre.getMadre() : null;
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
    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }
    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
    
    @Override
    public boolean equals(Object object)
    {
       if (object != null && object instanceof Mamifero)
            return this.identificador.equals(((Mamifero)object).getIdentificador());
        return false;
        }
    
    public boolean tieneComoAncestroA(Mamifero unMamifero)
    {
        return checkearPadre(this.padre, unMamifero) || checkearPadre(this.madre, unMamifero);
    }

    private boolean checkearPadre(Mamifero padre, Mamifero ancestro)
    {
            return padre != null ? padre.equals(ancestro) || padre.tieneComoAncestroA(ancestro) : false;

    }
}