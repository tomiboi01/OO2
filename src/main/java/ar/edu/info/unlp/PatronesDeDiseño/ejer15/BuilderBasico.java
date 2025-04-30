package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public class BuilderBasico extends Builder {
    
    public BuilderBasico() {
        this.equipo = new Equipo();
    }


    @Override
    public void buildProc() {
        equipo.setCpu(Catalogo.getComponente("Procesador básico")); 
    }

    @Override
    public void buildRAM() {
        equipo.setRam(Catalogo.getComponente("RAM 8 GB"));}

    @Override
    public void buildGrafica() {
         }

    @Override
    public void buildDisco() {
        equipo.setDisco(Catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    public void buildGabinete() {
        equipo.setGabinete(Catalogo.getComponente("Gabinete estándar"));
    }

    @Override
    public void buildFuente() {
        //gabinete estandar ya viene con fuente 
    }

    @Override
    public Equipo getEquipo() {
        return equipo;}
    
}
