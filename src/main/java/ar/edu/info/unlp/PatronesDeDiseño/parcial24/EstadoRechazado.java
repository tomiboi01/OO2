package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class EstadoRechazado extends EstadoDePrestamo {

    public EstadoRechazado(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void pagar()  {
        //throw new Error("No se puede pagar un préstamo finalizado.");
    }

    @Override
    public void gastosDeCancelacion() {
        throw new UnsupportedOperationException("No se pueden aplicar gastos de cancelación a un préstamo rechazado.");
    }

}
