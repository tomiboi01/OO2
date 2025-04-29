package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class BuilderVegano implements BuilderSanguche {
    private Sanguche sanguche;

    public BuilderVegano() {
        this.sanguche = new Sanguche();
    }
    @Override
    public void buildPan() {
        sanguche.setPan(new Ingrediente("Pan integral", 100));
    }

    @Override
    public void buildPrincipal() {
        sanguche.setPrincipal(new Ingrediente("Milanesa de girgolas", 500));
    }
    
    @Override
    public void buildAdicional() {
        //dejarlo vacío?
    }

    @Override
    public void buildAderezo() {
        sanguche.setAderezo(new Ingrediente("Salsa criolla", 20));
    }

    @Override
    public Sanguche getResult() {
        return this.sanguche;}

    @Override
    public void reset() {
        sanguche = new Sanguche();
    }


}
