package ar.edu.info.unlp.PatronesDeDiseño.parcial242dorecu;

public interface Item {
    public boolean guardarObjeto(Item item);

    public Item buscarItemPorNombre(String nombre);

    public String getNombre();

    public int getCapacidadTotalDisponible();

    public int espacioMaximoDeBolsaDisponible();

    
}
