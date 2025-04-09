package ar.edu.info.unlp.ejersDeRepaso.ejer2;

public class Papel {
    public int jugarCon(Opcion opcion) {
        return opcion.leGanaAPapel();
    }
    public int leGanaATijera() {
        return -1;
    }

    public int leGanaAPapel() {
        return 0;
    }

    public int leGanaAPiedra() {
        return 1;
    }

    public int leGanaALagarto() {
        return -1;
    }

    public int leGanaASpock() {
        return 1;
    }
    
}
