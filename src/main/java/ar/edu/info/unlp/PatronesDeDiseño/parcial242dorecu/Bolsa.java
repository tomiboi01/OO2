package ar.edu.info.unlp.PatronesDeDiseño.parcial242dorecu;

import java.util.ArrayList;
import java.util.List;

public class Bolsa implements Item{
    private List<Item> items;
    private final int MAX_ITEMS;

    public Bolsa(int capacidad) {
        this.items = new ArrayList<Item>();
        this.MAX_ITEMS = capacidad;
    }
    
    @Override
    public boolean guardarObjeto(Item item) {
        if (this.items.size() < MAX_ITEMS) {
            this.items.add(item);
            return true;
        }
        return this.items.stream().anyMatch(i -> i.guardarObjeto(item));
        
    }

    @Override
    public Item buscarItemPorNombre(String nombre) {
        return this.items.stream().filter(item -> item.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    @Override
    public int getCapacidadTotalDisponible() {
        return this.MAX_ITEMS - this.items.size() + this.items.stream().mapToInt(i -> i.getCapacidadTotalDisponible()).sum();
    }
    @Override
    public String getNombre() {
        return "bolsa";
     }

    public int espacioMaximoDeBolsaDisponible() {
        return Math.max(this.MAX_ITEMS - this.items.size(), this.items.stream()
            .mapToInt(i -> i.espacioMaximoDeBolsaDisponible())
            .sum());
    }


    
    
}
