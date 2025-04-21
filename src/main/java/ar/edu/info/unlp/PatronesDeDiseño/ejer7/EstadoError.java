package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public class EstadoError extends EstadoCalculadora{


    public EstadoError(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String setValor(String valor) {
        return "Error en la operación";
    }

    @Override
    public String resultado() {
        return "Error en la operación";
    }

    


}
