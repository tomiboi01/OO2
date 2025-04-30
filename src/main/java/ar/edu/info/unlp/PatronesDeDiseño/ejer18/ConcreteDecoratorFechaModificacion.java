package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public class ConcreteDecoratorFechaModificacion extends Decorator {
    

    public ConcreteDecoratorFechaModificacion(FileOO2 file, Component component) {
        super(file, component);
    }

    @Override
    public String prettyPrint() {
        return "Fecha de modificación: " + file.getFechaDeModificacion() +", "+ component.prettyPrint();
    }

    
}
