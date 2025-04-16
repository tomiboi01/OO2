package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class NovedadStrategy implements Strategy {

    @Override
    public List<Pelicula> sugerir(List<Pelicula> peliculas, Set<Pelicula> peliculasVistas) {
        // Ordenar las películas por año de estreno de forma descendente
        List<Pelicula> aux = new ArrayList<Pelicula>(peliculas);
        return aux.stream().sorted((p1, p2) -> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno())).limit(3).toList();
    
    }

}
