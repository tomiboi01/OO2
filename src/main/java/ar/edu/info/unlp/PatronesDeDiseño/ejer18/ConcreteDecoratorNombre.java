package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public class ConcreteDecoratorNombre extends Decorator{
    


    public ConcreteDecoratorNombre(FileOO2 file, Component component) {
        super(file, component);
    }

    @Override
    public String prettyPrint() {
        return "Nombre: " + file.getNombre() +", "+ component.prettyPrint();
    }

    
}
