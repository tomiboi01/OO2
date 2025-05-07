package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import java.time.LocalDate;
import java.util.Date;

public class MamiferoComposite extends Elemento {
    private Elemento padre;
    private Elemento madre;


    
    public MamiferoComposite(String id) {
        super(id);
    }


    public Elemento getPadre() {
        return padre;
    }
    public Elemento getMadre() {
        return madre;
    }
    public Elemento getAbueloPaterno() {
        return this.padre.getPadre();

    }
    public Elemento getAbueloMaterno() {
        return this.madre.getPadre() ;
    }
    public Elemento getAbuelaPaterna() {
        return this.padre.getMadre() ;
    }
    public Elemento getAbuelaMaterna() {
        return this.madre.getMadre();
    }
    
    public void setPadre(Elemento padre) {
        this.padre = padre;
    }
    public void setMadre(Elemento madre) {
        this.madre = madre;
    }


    public boolean equals(Elemento obj) {
        return this.identificador.equals(obj.identificador);
    }


    public boolean tieneComoAncestroA(Elemento unMamifero)
    {
    if ((padre != null && padre.equals(unMamifero)) || (madre != null && madre.equals(unMamifero)) ){
            return true;
        }
        return padre != null && this.padre.tieneComoAncestroA(unMamifero) || madre != null && this.madre.tieneComoAncestroA(unMamifero);
    }

}