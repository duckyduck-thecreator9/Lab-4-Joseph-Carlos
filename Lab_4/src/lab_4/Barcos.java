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
public class Barcos {
    private int x;
    private int y;

    public Barcos(int x, int y) {
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
        if (y == 1 && y == 7) {
        this.y = y;
        }
    }
    
    
}
