package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public class Calculadora {
    String valorAcumulado;
    EstadoCalculadora estadoCalculadora;
    EstrategiaOperacion estrategiaOperacion;

    public Calculadora() {
        this.valorAcumulado = "0";
        this.estadoCalculadora = new EstadoEsperandoValor(this);
        this.estrategiaOperacion = new EstrategiaSuma();
    }

    public void borrar()
    {
        this.valorAcumulado = "0";
        this.estadoCalculadora = new EstadoEsperandoValor(this);
        this.estrategiaOperacion = new EstrategiaSuma();
    }

    void setValor(double valor)
    {
        this.valorAcumulado = estadoCalculadora.setValor("" + valor);
    }
    public String getValor() {
        return this.valorAcumulado;
    }
    public void setEstrategiaOperacion(EstrategiaOperacion estrategiaOperacion) {
        this.estrategiaOperacion = estrategiaOperacion;
    }

    public void setEstadoCalculadora(EstadoCalculadora estadoCalculadora) {
        this.estadoCalculadora = estadoCalculadora;
    }

    public String resultado ()
    {
        return this.estadoCalculadora.resultado();
    }

    double operar(double a, double b) {
        return this.estrategiaOperacion.operar(a, b);
    }

    public void mas(){
        this.setEstrategiaOperacion(new EstrategiaSuma());
        this.estadoCalculadora.operar();
    }

    public void menos(){
        this.setEstrategiaOperacion(new EstrategiaResta());
        this.estadoCalculadora.operar();
    }
    public void por(){
        this.setEstrategiaOperacion(new EstrategiaMultiplicacion());
        this.estadoCalculadora.operar();
    }
    public void dividir(){
        this.setEstrategiaOperacion(new EstrategiaDivision());
        this.estadoCalculadora.operar();
    }
}
