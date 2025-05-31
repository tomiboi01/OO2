package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class EstadoFinalizado extends EstadoDePrestamo {

    public EstadoFinalizado(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void pagar()  {
        //throw new Error("No se puede pagar un préstamo finalizado.");
    }

    @Override
    public void gastosDeCancelacion() {
        // No hay gastos de cancelación en un préstamo finalizado
        throw new UnsupportedOperationException("No hay gastos de cancelación en un préstamo finalizado.");
    }

}
