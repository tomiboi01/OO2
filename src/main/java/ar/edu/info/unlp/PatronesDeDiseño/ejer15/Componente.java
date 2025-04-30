package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public class Componente {
    private String nombre;
    private double precio;
    private int consumoW;

    public Componente(String nombre, double precio, int consumoW) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumoW = consumoW;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    
}
