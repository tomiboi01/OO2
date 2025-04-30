package ar.edu.info.unlp.PatronesDeDiseño.ejer18;

public abstract class Decorator implements Component {
    protected Component component;
    protected FileOO2 file;

    public Decorator(FileOO2 file, Component component) {
        this.component = component;
        this.file = file;
    }

    @Override
    public abstract String prettyPrint();
    
}
