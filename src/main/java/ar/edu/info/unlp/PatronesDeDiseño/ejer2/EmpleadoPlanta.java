package ar.edu.info.unlp.PatronesDeDiseño.ejer2;

public class EmpleadoPlanta extends Empleado {
    private int antiguedad;
    private int cantidadDeHijos;
    private boolean estaCasado;


   public double basico() {
        return 50000;
    }
   public double adicional() {
      return  2000 * antiguedad + 2000 * cantidadDeHijos + (estaCasado ? 5000 : 0);
   }
   

}
