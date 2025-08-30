package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

public class ArmaduraDeHierro extends Armadura {
    @Override
    public int dañoRecibido(Arma arma) {
        return arma.dañoCausadoAArmaduraDeHierro();
    }
    
}
