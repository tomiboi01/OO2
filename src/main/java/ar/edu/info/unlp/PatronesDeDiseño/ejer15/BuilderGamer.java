package ar.edu.info.unlp.PatronesDeDiseño.ejer15;

public class BuilderGamer extends Builder {

    @Override
    public void buildProc() {
        this.equipo.setCpu(Catalogo.getComponente("Procesador gamer"));
        this.equipo.setPadTermico(Catalogo.getComponente("Pad termico"));
        this.equipo.setCooler(Catalogo.getComponente("Cooler"));

    }

    @Override
    public void buildRam() {
        }

    @Override
    public void buildGrafica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildGrafica'");
    }

    @Override
    public void buildDisco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildDisco'");
    }

    @Override
    public void buildGabinete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildGabinete'");
    }

    @Override
    public void buildFuente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildFuente'");
    }

    @Override
    public Equipo getEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEquipo'");
    }
    
}
