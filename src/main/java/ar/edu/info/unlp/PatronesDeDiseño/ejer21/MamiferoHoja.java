package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import java.time.LocalDate;

public class MamiferoHoja extends Elemento {



    public MamiferoHoja(String identificador) {
        super(identificador);
    }

    @Override
    public Elemento getPadre() {
       return null;
    }

    @Override
    public Elemento getMadre() {
        return null;}

    @Override
    public Elemento getAbueloPaterno() {
        return null; }

    @Override
    public Elemento getAbueloMaterno() {
        return null;}

    @Override
    public Elemento getAbuelaPaterna() {
        return null;
    }

    @Override
    public Elemento getAbuelaMaterna() {
        return null;
    }

    @Override
    public boolean tieneComoAncestroA(Elemento elemento) {
        return false;
    }
    
    
}
