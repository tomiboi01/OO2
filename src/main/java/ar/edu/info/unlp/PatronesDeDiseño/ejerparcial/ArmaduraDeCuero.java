package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;


public class ArmaduraDeCuero extends Armadura {
    @Override
    public int dañoRecibido(Arma arma) {
        return arma.dañoCausadoAArmaduraDeCuero();
    }
    
}