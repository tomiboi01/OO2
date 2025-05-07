package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

public interface ComponenteWeather {
    public String displayData(); //retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
    public double getTemperatura(); //retorna la temperatura en grados Celsius
    public double getPresion(); //retorna la presión atmosférica en hPa
    public double getMinimo(); 
    public double getMaximo(); 
    public double getPromedio();
}
