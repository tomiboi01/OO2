package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public class PromedioEnCDecorator extends Decorator{
    public PromedioEnCDecorator(ComponenteWeather componenteDecorado) {
        super(componenteDecorado);
    }

    @Override
    public String displayData() {
        return " Promedio: " + this.getPromedioEnC() +", " +this.componenteDecorado.displayData();
    }
    private double getPromedioEnC() {
        return (this.componenteDecorado.getPromedio() - 32) / 1.8;
    }



}
