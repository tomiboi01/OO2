package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class EstadoAceptado extends EstadoDePrestamo {

   

    public EstadoAceptado(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void pagar() {
        prestamo.setCuotasPagadas(prestamo.getCuotasPagadas() + 1);
        if (prestamo.getCuotasPagadas() == prestamo.cuotas) {
            prestamo.setEstado(new EstadoFinalizado(prestamo));
        }
    }

    //Template method

    @Override
    public double gastosDeCancelacion() {
        return this.prestamo.getMontoRestante() + prestamo.getGastosAdminstrativo() + prestamo.getValorDeSellado();

    }



}
