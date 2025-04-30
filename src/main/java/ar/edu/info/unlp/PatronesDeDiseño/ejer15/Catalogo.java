package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public class Catalogo {
    public static Componente getComponente(String nombre)
    {
        return new Componente(nombre, 100, 100);
    }
    
}
