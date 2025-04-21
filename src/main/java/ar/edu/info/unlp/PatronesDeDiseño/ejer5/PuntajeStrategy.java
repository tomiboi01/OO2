package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.List;
import java.util.Set;

public class PuntajeStrategy implements Strategy{

    @Override
    public List<Pelicula> sugerir(List<Pelicula> peliculas , Set<Pelicula> peliculasVistas) {
        // Ordenar las películas por puntaje de forma descendente
        return peliculas.stream().sorted(new ComparadorPuntaje()).limit(3).toList();
    }
}
