package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.Comparator;

public class ComparadorPuntaje implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        int valorPuntajeComparado = Double.compare(p1.getPuntaje(), p2.getPuntaje());
        return valorPuntajeComparado != 0 ? valorPuntajeComparado : Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno());

    }
    
}
