package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public class TemperaturaEnCDecorator extends Decorator{
    public TemperaturaEnCDecorator(ComponenteWeather componenteDecorado) {
        super(componenteDecorado);
    }

    @Override
    public String displayData() {
        return " Temperatura en Fahrenheit: " + this.getTemperaturaEnC() +", " +this.componenteDecorado.displayData();
    }

    private double getTemperaturaEnC() {
        return (this.componenteDecorado.getTemperatura() - 32) / 1.8;
    }

}
