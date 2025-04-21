package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public abstract class EstadoCalculadora {
    protected Calculadora calculadora;
    public abstract String setValor(String valor);


    public EstadoCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
   
     public void operar()
     {
        this.calculadora.setEstadoCalculadora(new EstadoError(this.calculadora));
     }

    public String resultado() {
        return this.calculadora.getValor();
}

}