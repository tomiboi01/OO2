package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public abstract class Builder {
    protected Equipo equipo;

    public Builder()
    {
        this.reset();
    }

    public abstract void buildProc();
    public abstract void buildRAM();
    public abstract void buildGrafica();
    public abstract void buildDisco();
    public abstract void buildGabinete();
    public abstract void buildFuente();
    public abstract Equipo getEquipo();

    public void reset()
    {
        this.equipo = new Equipo();
    }
    
}
