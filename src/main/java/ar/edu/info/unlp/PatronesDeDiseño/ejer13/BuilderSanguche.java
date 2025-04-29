package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public interface BuilderSanguche {

    public void buildPan();
    public void buildPrincipal ();
    public void buildAdicional ();
    public void buildAderezo ();
    public Sanguche getResult();
    public void reset();
}
