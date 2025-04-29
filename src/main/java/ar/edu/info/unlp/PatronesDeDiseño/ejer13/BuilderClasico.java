package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class BuilderClasico implements BuilderSanguche {
    private Sanguche sanguche;

    public BuilderClasico() {
        this.sanguche = new Sanguche();
    }
    @Override
    public void buildPan() {
        sanguche.setPan(new Ingrediente("Pan brioche", 100));
    }

    @Override
    public void buildPrincipal() {
        sanguche.setPrincipal(new Ingrediente("Carne de ternera", 300));
    }
    
    @Override
    public void buildAdicional() {
        sanguche.setAdicional(new Ingrediente("Tomate", 80));
    }

    @Override
    public void buildAderezo() {
        sanguche.setAderezo(new Ingrediente("Mayonesa", 20));
    }

    @Override
    public Sanguche getResult() {
        return this.sanguche;}

    @Override
    public void reset() {
        sanguche = new Sanguche();
    }


}
