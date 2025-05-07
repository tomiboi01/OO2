package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public class MinimoDecorator extends Decorator{
    public MinimoDecorator(ComponenteWeather componenteDecorado) {
        super(componenteDecorado);
    }

    @Override
    public String displayData() {
        return " Minimo: " + this.getMinimo() +", " +this.componenteDecorado.displayData();
    }




}
