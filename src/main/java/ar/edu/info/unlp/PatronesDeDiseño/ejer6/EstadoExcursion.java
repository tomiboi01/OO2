package ar.edu.info.unlp.PatronesDeDiseño.ejer6;

public abstract class EstadoExcursion {
    protected Excursion excursion;

    public String darInfo()
    {
        return this.excursion.getNombre() + this.excursion.getCosto() + this.excursion.getCupoMaximo() + this.excursion.getLugarEncuentro()
        + this.infoAdicional();

    }
              
    protected abstract String infoAdicional();

}
