package ar.edu.info.unlp.PatronesDeDiseño.ejer14;

public class Inmueble extends Prenda {
    private double costoMetroCuadrado;
    private int superficie;
    private String direccion;

    public Inmueble(double coeficiendeDeLiquidez, double costoMetroCuadrado, int superficie, String direccion) {
        super(coeficiendeDeLiquidez);
        this.costoMetroCuadrado = costoMetroCuadrado;
        this.superficie = superficie;
        this.direccion = direccion;
    }

    @Override
    protected double getValor() {
        return this.costoMetroCuadrado * this.superficie;
    }
}
