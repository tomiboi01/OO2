package ar.edu.info.unlp.PatronesDeDiseño.ejerparcial;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private int vida;
    private Armadura armadura;
    private Arma arma;
    private List<String> habilidades;

    public Personaje(String nombre, int vida, Armadura armadura, Arma arma) {
        super();
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.arma = arma;
    }

    public Personaje() {
        this.habilidades = new ArrayList<>();
    };

    public void enfrentar(Personaje contrincante)
    {
        if (this.estaVivo() && contrincante.estaVivo()) {
            this.recibirAtaque(contrincante);
            if (contrincante.estaVivo()) {
                contrincante.recibirAtaque(this);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibirAtaque(Personaje atacante) {
        if (this.estaVivo()) {
            this.vida -=  this.armadura.dañoRecibido(atacante.getArma());
        }
    }

    public Arma getArma() {
        return arma;
    }
    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
