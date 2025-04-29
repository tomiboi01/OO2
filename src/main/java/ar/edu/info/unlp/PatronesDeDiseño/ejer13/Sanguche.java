package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class Sanguche {
    private Ingrediente pan;
    private Ingrediente principal;
    private Ingrediente adicional;
    private Ingrediente aderezo;

    

    public Ingrediente getPan() {
        return pan;
    }

    public void setPan(Ingrediente pan) {
        this.pan = pan;
    }

    public Ingrediente getPrincipal() {
        return principal;
    }

    public void setPrincipal(Ingrediente principal) {
        this.principal = principal;
    }

    public Ingrediente getAdicional() {
        return adicional;
    }

    public void setAdicional(Ingrediente adicional) {
        this.adicional = adicional;
    }



    public Ingrediente getAderezo() {
        return aderezo;
    }



    public void setAderezo(Ingrediente aderezo) {
        this.aderezo = aderezo;
    }



    public double getPrecio()
    {
        double precio = 0.0;
        if (this.pan != null) {
            precio += this.pan.getPrecio();
        }
        if (this.principal != null) {
            precio += this.principal.getPrecio();
        }
        if (this.adicional != null) {
            precio += this.adicional.getPrecio();
        }
        if (this.aderezo != null) {
            precio += this.aderezo.getPrecio();
        }
        return precio;
    }

}
