package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import java.time.LocalDate;

public interface MamiferoInterfaz {

    public String getIdentificador() ;
    public String getEspecie();
    public LocalDate getFechaNacimiento();
    public Mamifero getPadre() ;
    public Mamifero getMadre() ;
    public Mamifero getAbueloPaterno() ;

    public Mamifero getAbueloMaterno() ;

    public Mamifero getAbuelaPaterna() ;

    public Mamifero getAbuelaMaterna() ;

    public void setIdentificador(String identificador) ;

    public void setEspecie(String especie) ;

    public void setFechaNacimiento(LocalDate fechaNacimiento) ;

    public void setPadre(Mamifero padre) ;

    public void setMadre(Mamifero madre) ;

    public boolean tieneComoAncestroA(Mamifero unMamifero)
    ;

}