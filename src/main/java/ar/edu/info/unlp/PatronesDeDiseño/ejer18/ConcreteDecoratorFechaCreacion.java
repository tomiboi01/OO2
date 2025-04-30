package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public class ConcreteDecoratorFechaCreacion extends Decorator {


    public ConcreteDecoratorFechaCreacion(FileOO2 file, Component component) {
        super(file, component);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String prettyPrint() {
        return "Fecha de creación: " + file.getFechaDeCreacion() +", " + component.prettyPrint();
    }

    
}
