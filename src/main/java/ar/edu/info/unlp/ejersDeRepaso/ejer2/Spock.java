package ar.edu.info.unlp.ejersDeRepaso.ejer2;

public class Spock implements Opcion{
    public int jugarCon(Opcion opcion) {
        return opcion.leGanaASpock();
    }
    public int leGanaATijera() {
        return -1;
    }

    public int leGanaAPapel() {
        return 1;
    }

    public int leGanaAPiedra() {
        return -1;
    }

    public int leGanaALagarto() {
        return -1;
    }

    public int leGanaASpock() {
        return 0;
    }
    
}
