package ar.edu.info.unlp.PatronesDeDiseño.ejer7;

public class EstrategiaDivision implements EstrategiaOperacion{

    @Override
    public double operar(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("che no, Division by zero is not allowed.");
        }
        return a / b;
    }
    
}
