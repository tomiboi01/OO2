package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class PrestamoUva extends Prestamo{
    double indiceActual = 1.0; // Valor inicial del índice UVA, puede ser actualizado según el contexto
    public PrestamoUva(double monto, Cliente cliente, int cuotas) {
        super(monto, cliente, cuotas);
    }
    @Override
    public double getTasaDeInteres() {
        return indiceActual;
    }
    
}
