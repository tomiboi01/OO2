package ar.edu.info.unlp.ejer2;

public class Piedra implements Opcion{
    public int leGanaATijera() {
        return 1;
    }

    public int leGanaAPapel() {
        return -1;
    }

    public int leGanaAPiedra() {
        return 0;
    }

    public int leGanaALagarto() {
        return 1;
    }

    public int leGanaASpock() {
        return -1;
    }

    
}
