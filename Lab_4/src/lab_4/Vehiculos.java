/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;
import java.util.Random;
/**
 *
 * @author joseph
 */
public abstract class Vehiculos implements Movement{
    private Random r = new Random();
    private int dano = 99 + r.nextInt(151);
    private int vida = 499 + r.nextInt(501);
    private Jugador jugador;

    public Vehiculos() {
    }

    public Vehiculos(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public abstract double Movimiento(int x1, int x2, int y1, int y2);
}
