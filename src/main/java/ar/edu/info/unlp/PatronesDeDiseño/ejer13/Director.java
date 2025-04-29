package ar.edu.info.unlp.PatronesDeDiseño.ejer13;

public class Director {


    public Sanguche construir(BuilderSanguche builder) {
        builder.reset();
        builder.buildPan();
        builder.buildPrincipal();
        builder.buildAdicional();
        builder.buildAderezo();
        return builder.getResult();
    
}
}
