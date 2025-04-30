package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public class ConcreteDecoratorExtension extends Decorator{
    

    public ConcreteDecoratorExtension(FileOO2 file, Component component) {
        super(file, component);
    }

    @Override
    public String prettyPrint() {
        return "Extensión: " + file.getExtension() + ", " + component.prettyPrint();
    }

    
}
