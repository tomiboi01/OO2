package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public class ArmaduraDeAcero extends Armadura{
    @Override
    public int dañoRecibido(Arma arma) {
        return arma.dañoCausadoAArmaduraDeAcero();
    }
    
    
}
