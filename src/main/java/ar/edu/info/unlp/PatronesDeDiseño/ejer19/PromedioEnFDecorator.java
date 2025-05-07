package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public class PromedioEnFDecorator extends Decorator{
    public PromedioEnFDecorator(ComponenteWeather componenteDecorado) {
        super(componenteDecorado);
    }

    @Override
    public String displayData() {
        return " Promedio: " + this.getPromedio() +", " +this.componenteDecorado.displayData();
    }



}
