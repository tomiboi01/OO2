package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.List;
import java.util.Set;

public class SimilaridadStrategy implements Strategy {
    
    @Override
    public List<Pelicula> sugerir(List<Pelicula> peliculas, Set<Pelicula> peliculasVistas) {
        return peliculasVistas.stream().filter(p-> p.tieneSimilares()).findFirst().get().getTopXPeliculasSimilaresOrdenadas(3);
    }   
}
