package ar.edu.info.unlp.PatronesDeDiseño.parcial24;

public class Cliente {
    private String nombre;
    private double salarioMensual;

    public Cliente(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }
    
}
