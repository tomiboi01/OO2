package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public class EstadoEsperandoValor extends EstadoCalculadora{

    public EstadoEsperandoValor(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String setValor(String valor) {
        this.calculadora.setEstadoCalculadora(new EstadoEsperandoOperacion(this.calculadora));
        try {
        return "" + this.calculadora.operar(Double.parseDouble(this.calculadora.getValor()), Double.parseDouble(valor));
        }
        catch (Exception e) {

            EstadoError estadoError = new EstadoError(calculadora);
            this.calculadora.setEstadoCalculadora(estadoError);
            return estadoError.setValor(valor);
        }
    }


}
