package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public class Director {
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void build(String nombre) {
        this.builder.buildProc();
        this.builder.buildRam();
        this.builder.buildDisco();
        this.builder.buildGrafica();
        this.builder.buildGabinete();
    }
    
}
