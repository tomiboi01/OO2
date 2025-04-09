package ar.edu.info.unlp.PatronesDeDiseño.ejer2;

public class EmpleadoPasante extends Empleado {
    private int examenesRendidos;


   public double basico() {
        return 20000;
     }
   public double adicional() {
      return  2000 * examenesRendidos;
   }

}
