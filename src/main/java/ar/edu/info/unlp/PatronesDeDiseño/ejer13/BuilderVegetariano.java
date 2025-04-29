package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class BuilderVegetariano implements BuilderSanguche {
    private Sanguche sanguche;

    public BuilderVegetariano() {
        this.sanguche = new Sanguche();
    }
    @Override
    public void buildPan() {
        sanguche.setPan(new Ingrediente("Pan con semillas", 120));
    }

    @Override
    public void buildPrincipal() {
        sanguche.setPrincipal(new Ingrediente("Provoleta grillada", 200));
    }
    
    @Override
    public void buildAdicional() {
        sanguche.setAdicional(new Ingrediente("Berenjenas al escabeche", 100));
    }

    @Override
    public void buildAderezo() {
    //dejarlo vacío?
    }

    @Override
    public Sanguche getResult() {
        return this.sanguche;}

    @Override
    public void reset() {
        sanguche = new Sanguche();
    }


}
