package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public abstract class Prestamo {
    protected double monto;
    protected Cliente cliente;
    protected int cuotas;
    protected int cuotasPagadas;
    EstadoDePrestamo estado;


    public Prestamo(double monto, Cliente cliente, int cuotas) {
        this.monto = monto;
        this.cliente = cliente;
        this.cuotas = cuotas;
        this.cuotasPagadas = 0;
        this.estado = estadoInicial();
    }

    private EstadoDePrestamo estadoInicial() {
        if (cliente.getSalarioMensual() * 0.3 >= monto) 
            return new EstadoAceptado(this);
        return new EstadoRechazado(this);

    }

    //template method
    public double calcularValorPorCuota()
    {
        return (this.monto / this.cuotas) * getTasaDeInteres();
    }

    public void pagarUnaCuota() {
        this.estado.pagar();
    }

    public abstract double getTasaDeInteres();

    public double getMontoPagado()
    {
        return this.calcularValorPorCuota() * this.cuotasPagadas;
    }

    public double getMontoRestante() {
        return this.calcularValorPorCuota() * (this.cuotas - this.cuotasPagadas);
    }

    public void setEstado (EstadoDePrestamo estado) {
        this.estado = estado;
    }
    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
    public int getCuotasPagadas() {
        return this.cuotasPagadas;
    }

    public abstract double getValorDeSellado();

    public double getGastosAdminstrativo() {
        return this.getMontoRestante() * 0.1; 
        
    }
        
    
}
