package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class PrestamoSimple extends Prestamo{
    private double tasaDeInteres;

    public PrestamoSimple(double monto, Cliente cliente, int cuotas, double tasaDeInteres) {
        super(monto, cliente, cuotas);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public double getTasaDeInteres() {
        return this.tasaDeInteres;
    }

    

    @Override
    public double getValorDeSellado()
    {
        return 5000;
    }

    
    
}
