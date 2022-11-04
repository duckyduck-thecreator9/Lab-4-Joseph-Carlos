/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;

/**
 *
 * @author joseph
 */
public class Submarinos extends Vehiculos{
    private int x;
    private int y;
    private String n;

    public Submarinos(int x, int y, Jugador jugador) {
        super(jugador);
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0 && x <= 9) {
        this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y == 9 || y == 0) {
        this.y = y;
        }
    }
    
    
}
