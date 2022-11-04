/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;

import java.awt.Color;

/**
 *
 * @author joseph
 */
    public class Aviones extends Vehiculos{
    private int x;
    private int y;

    public Aviones(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        if (x >= 0 && x <= 10) {
        this.x = x;
        } else {
            throw new MiException("eso es out of bounds");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
