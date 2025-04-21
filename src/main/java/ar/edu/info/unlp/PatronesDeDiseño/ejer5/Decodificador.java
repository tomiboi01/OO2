package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Decodificador {
    private List<Pelicula> peliculas;
    private Set<Pelicula> peliculasVistas;
    private Strategy strategy;

    public Decodificador( Strategy strategy) {
        this.peliculas = new ArrayList<>();
        this.strategy = strategy;
        this.peliculasVistas = new HashSet<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public void sugerir()
    {
        this.strategy.sugerir(this.peliculas.stream().filter(p -> !this.peliculasVistas.contains(p)).toList(), this.peliculasVistas);
    }
}
