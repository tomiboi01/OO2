package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class BuilderSinTacc implements BuilderSanguche {
    private Sanguche sanguche;

    public BuilderSinTacc() {
        this.sanguche = new Sanguche();
    }
    @Override
    public void buildPan() {
        sanguche.setPan(new Ingrediente("Pan de chipá", 150));
    }

    @Override
    public void buildPrincipal() {
        sanguche.setPrincipal(new Ingrediente("Carne de pollo", 250));
    }
    
    @Override
    public void buildAdicional() {
        sanguche.setAdicional(new Ingrediente("Verduras grilladas", 200));
    }

    @Override
    public void buildAderezo() {
        sanguche.setAderezo(new Ingrediente("Salsa tártara", 18));
    }

    @Override
    public Sanguche getResult() {
        return this.sanguche;}

    @Override
    public void reset() {
        sanguche = new Sanguche();
    }


}

