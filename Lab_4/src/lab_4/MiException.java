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
public class MiException extends Exception{
    private Color color;

    public MiException() {
    }

    public MiException(Color color, String message) {
        super(message);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
