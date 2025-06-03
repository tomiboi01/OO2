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
    public double gastosDeCancelacion() {
        return 0; }

}
