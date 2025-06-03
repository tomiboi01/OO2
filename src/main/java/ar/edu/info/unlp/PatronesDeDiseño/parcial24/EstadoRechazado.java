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
    public double gastosDeCancelacion() {
         //throw new Error("No se puede calcular los gatos de cancelación un préstamo finalizado.");}
        return 0;
    }
}
