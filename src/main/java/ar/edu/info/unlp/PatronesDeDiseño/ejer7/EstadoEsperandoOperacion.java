package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public class EstadoEsperandoOperacion extends EstadoCalculadora {

    public EstadoEsperandoOperacion(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String setValor(String valor) {
        EstadoError estadoError = new EstadoError(calculadora);
        this.calculadora.setEstadoCalculadora(estadoError);
        return estadoError.setValor(valor);

    }

    @Override
    public void operar()
    {
        this.calculadora.setEstadoCalculadora(new EstadoEsperandoValor(this.calculadora));
    }
    

    



    

    
}
