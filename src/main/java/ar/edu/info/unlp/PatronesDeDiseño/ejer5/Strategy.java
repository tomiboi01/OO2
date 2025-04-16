package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public interface Strategy {

    List<Pelicula> sugerir(List<Pelicula> peliculas, Set<Pelicula> peliculasVistas);

}
