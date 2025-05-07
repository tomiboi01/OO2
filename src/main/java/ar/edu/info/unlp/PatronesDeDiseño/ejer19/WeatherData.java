package ar.edu.info.unlp.PatronesDeDiseño.ejer19;

import java.util.List;

public interface WeatherData {
    public double getTemperatura();

//retorna la presión atmosférica en hPa
public double getPresion();

//retorna la radiación solar
public double getRadiacionSolar();

//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
public List<Double> getTemperaturas();

//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
public String displayData();

}
