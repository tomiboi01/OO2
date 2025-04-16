package ar.edu.info.unlp.PatronesDeDiseño.ejer5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioEstreno;
    private int puntaje;
    private List<Pelicula> peliculasSimilares;
    
    public Pelicula(String titulo, int anioEstreno, int puntaje) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.puntaje = puntaje;
        this.peliculasSimilares = new ArrayList<>();
    }

    public void agregarPeliculaSimilar(Pelicula pelicula) {
        this.peliculasSimilares.add(pelicula);
    }

    public List<Pelicula> getTopXPeliculasSimilaresOrdenadas(int x) {
        return peliculasSimilares.stream().sorted((p1,p2)->Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno())).limit(x).toList();
    }

    public boolean tieneSimilares() {
        return !this.peliculasSimilares.isEmpty();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + anioEstreno;
        result = prime * result + puntaje;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (anioEstreno != other.anioEstreno)
            return false;
        if (puntaje != other.puntaje)
            return false;
        return true;
    }



    

    

}
