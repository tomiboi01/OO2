package ar.edu.info.unlp.PatronesDeDiseño.ejer2;

public abstract class Empleado {


    public double sueldo()
    {
        return this.basico() + this.adicional() - this.descuento();
    }

    public abstract double basico();
    public abstract double adicional();
    
    public double descuento()
    {
        return 0.13*basico() + adicional()*0.05;
    }


}
