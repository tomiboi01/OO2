package ar.edu.info.unlp.PatronesDeDiseño.parcial242dorecu;

public class Jugador {
    private String nombre;
    private Bolsa bolsa;

    public Jugador(String nombre, int capacidad) {
        this.nombre = nombre;
        this.bolsa = new Bolsa(capacidad);
    }

    public boolean guardarObjeto(Item item) {
        return this.bolsa.guardarObjeto(item);
    }

    public int getCapacidadTotalDisponible()
    {
        return this.bolsa.getCapacidadTotalDisponible();
    }

    public Item buscarItemPorItemNombre(String nombre) {
        return this.bolsa.buscarItemPorNombre(nombre);
    }

    public int espacioMaximoDeBolsaDisponible() {
        return this.bolsa.espacioMaximoDeBolsaDisponible();
    }


    
}
