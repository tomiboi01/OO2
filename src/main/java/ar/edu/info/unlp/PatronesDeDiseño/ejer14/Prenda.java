package ar.edu.info.unlp.PatronesDeDiseño.ejer14;

public abstract class Prenda {
    protected double coeficiendeDeLiquidez;

    public Prenda(double coeficiendeDeLiquidez) {
        this.coeficiendeDeLiquidez = coeficiendeDeLiquidez;
    }

    public Prenda(){}


    public double getValorPrendario()
    {
        return this.getValor() * this.coeficiendeDeLiquidez;
    }

    protected abstract double getValor();

}
