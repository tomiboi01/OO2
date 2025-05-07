package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public abstract class Decorator implements ComponenteWeather {
    protected ComponenteWeather componenteDecorado;
    
    @Override
    public abstract String displayData();

    public Decorator(ComponenteWeather componenteDecorado) {
        this.componenteDecorado = componenteDecorado;
    }

    @Override
    public double getTemperatura() {
        return this.componenteDecorado.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.componenteDecorado.getPresion();
    }
    @Override
    public double getMinimo() {
        return this.componenteDecorado.getMinimo();
    }
    @Override
    public double getMaximo() {
        return this.componenteDecorado.getMaximo();
    }
    @Override
    public double getPromedio() {
        return this.componenteDecorado.getPromedio();
    }





    
    
}
