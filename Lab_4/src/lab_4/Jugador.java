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
public class Jugador {
    private String nombre;
    private int cantvict;

    public Jugador() {
    }

    public Jugador(String nombre, int cantvict) {
        this.nombre = nombre;
        this.cantvict = cantvict;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantvict() {
        return cantvict;
    }

    public void setCantvict(int cantvict) {
        this.cantvict = cantvict;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
}
