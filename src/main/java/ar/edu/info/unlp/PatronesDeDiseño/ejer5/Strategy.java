package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.List;
import java.util.Set;

public interface Strategy {

    List<Pelicula> sugerir(List<Pelicula> peliculas, Set<Pelicula> peliculasVistas);

}
