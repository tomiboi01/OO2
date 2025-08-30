package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public abstract class Builder {
    protected Personaje personaje;

    public Builder() {
        this.personaje = new Personaje();
    }

    public abstract void buildArmadura();
    public abstract void buildArma();
    public void buildNombre(String nombre) {
        this.personaje.setNombre(nombre);
    }
    
}
