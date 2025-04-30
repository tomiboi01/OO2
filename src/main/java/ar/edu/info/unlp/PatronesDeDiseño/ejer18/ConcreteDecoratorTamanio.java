package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public class ConcreteDecoratorTamanio extends Decorator{
    
    public ConcreteDecoratorTamanio(FileOO2 file, Component component) {
        super(file, component);
    }

    @Override
    public String prettyPrint() {
        return "Tamaño: "+ file.getTamanio() +", "+ component.prettyPrint();
    }

    
}
