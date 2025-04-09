package ar.edu.info.unlp.PatronesDeDiseño.ejer2;

public class EmpleadoTemporario extends Empleado {
    private int horasTrabajadas;
    private int cantidadDeHijos;
    private boolean estaCasado;


   public double basico() {
        return 20000 + horasTrabajadas * 300;
    }
   public double adicional() {
      return  2000 * cantidadDeHijos + (estaCasado ? 5000 : 0);
   }   

}
