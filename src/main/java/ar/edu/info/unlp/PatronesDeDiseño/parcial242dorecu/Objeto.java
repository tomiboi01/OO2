package ar.edu.info.unlp.PatronesDeDiseño.parcial242dorecu;

public class Objeto implements Item{
    private String nombre;
    

    @Override
    public boolean guardarObjeto(Item item) {
        return false;
    }

    @Override
    public Item buscarItemPorNombre(String nombre) {
        return this.nombre.equals(nombre) ? this : null; 
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getCapacidadTotalDisponible() {
        return 0;
    }

    @Override
    public int espacioMaximoDeBolsaDisponible() {
        return 0;
    }

}
    
