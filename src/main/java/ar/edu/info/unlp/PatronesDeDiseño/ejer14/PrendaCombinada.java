package ar.edu.info.unlp.PatronesDeDiseño.ejer14;

import java.util.List;

public class PrendaCombinada extends Prenda {
    public PrendaCombinada() {
        this.coeficiendeDeLiquidez = 0.5;
        prendas = new java.util.ArrayList<Prenda>();
    }

    private List<Prenda> prendas;

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    @Override
    protected double getValor() {
        return prendas.stream().mapToDouble(p -> p.getValor()).sum();
    }
    
}
