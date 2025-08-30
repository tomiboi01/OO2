package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public class Espada extends Arma {
    @Override
    public int dañoCausadoAArmaduraDeCuero() {
        return 8;
    }

    @Override
    public int dañoCausadoAArmaduraDeHierro() {
        return 5;
    }

    @Override
    public int dañoCausadoAArmaduraDeAcero() {
        return 3;
    }
    
}
