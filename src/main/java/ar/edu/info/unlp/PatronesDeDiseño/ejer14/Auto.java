package ar.edu.info.unlp.PatronesDeDiseño.ejer14;

import java.time.Year;

public class Auto extends Prenda {
   
   private String modelo;
   private int kilometraje;
   private int antiguedad;
   private double costo0km;
   
   public Auto(double coeficiendeDeLiquidez, String modelo, int kilometraje, int antiguedad, double costo0km) {
    super(coeficiendeDeLiquidez);
    this.modelo = modelo;
    this.kilometraje = kilometraje;
    this.antiguedad = antiguedad;
    this.costo0km = costo0km;
    }
   @Override
   protected double getValor() {
    if (antiguedad > 9) 
        return 0;
    return this.costo0km * (1 - 0.1 * antiguedad);
    }    
}

