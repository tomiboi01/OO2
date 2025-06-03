package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public abstract class EstadoDePrestamo {
    protected Prestamo prestamo;
    public EstadoDePrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public abstract void pagar();
    public abstract double gastosDeCancelacion();
}
