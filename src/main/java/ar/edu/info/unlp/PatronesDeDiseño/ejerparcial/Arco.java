package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public class Arco extends Arma {

    @Override
    public int dañoCausadoAArmaduraDeCuero() {
        return 5;
    }

    @Override
    public int dañoCausadoAArmaduraDeHierro() {
        return 3;
    }

    @Override
    public int dañoCausadoAArmaduraDeAcero() {
        return 2;
    }
    
}
