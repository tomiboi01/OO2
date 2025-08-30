package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public class Baston extends Arma{
    @Override
    public int dañoCausadoAArmaduraDeCuero() {
        return 2;
    }

    @Override
    public int dañoCausadoAArmaduraDeHierro() {
        return 1;
    }

    @Override
    public int dañoCausadoAArmaduraDeAcero() {
        return 1;
    }
    
}
