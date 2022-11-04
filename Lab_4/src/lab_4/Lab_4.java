/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author joseph
 */
public class Lab_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList Azul = new ArrayList();
        ArrayList Rojo = new ArrayList();
        ArrayList jugadores = new ArrayList();
        String[] nombres = {"Azar", "Carlos", "Mufasa", "Milk", "slayer", "Biguy", "guy", "jocastle", "James", "Daniel"};
       
        //Creacion de jugadores azules
        for (int i = 0; i < 5; i ++) {
            int temp =  1 + r.nextInt(9);
            int v = 1  + r.nextInt(3);
            int y = 1 + r.nextInt(9);
            int var = 1 + r.nextInt(2);
            Jugador j = new Jugador(nombres[temp], 0);
            
            if (v == 1) {
            Vehiculos veh = new Aviones(temp, y, j);
            Azul.add(veh);
            }
            if (v == 2) {
                if (var == 1) {
            Vehiculos veh = new Submarinos(temp, 0, j);
            Azul.add(veh);
                }
                if (var == 2) {
            Vehiculos veh = new Submarinos(temp, 9, j);
            Azul.add(veh);
            }
            }
            if (v == 3) {
            if (var == 1) {
            Vehiculos veh = new Barcos(temp, 1, j);
            Azul.add(veh);
                }
                if (var == 2) {
            Vehiculos veh = new Barcos(temp, 8, j);
            Azul.add(veh);
            }
            }
        }
        //fin azules
        //comienzo rojos
        for (int i = 0; i < 5; i ++) {
            int temp =  1 + r.nextInt(9);
            int v = 1  +r.nextInt(3);
            int y = 1 + r.nextInt(9);
            int var = 1 + r.nextInt(2);
            Jugador j = new Jugador(nombres[temp], 0);
            if (v == 1) {
            Vehiculos veh = new Aviones(temp, y, j);
            Rojo.add(veh);
            }
            if (v == 2) {
                if (var == 1) {
            Vehiculos veh = new Submarinos(temp, 0, j);
            Rojo.add(veh);
                }
                if (var == 2) {
            Vehiculos veh = new Submarinos(temp, 9, j);
            Rojo.add(veh);
            }
            }
            if (v == 3) {
            if (var == 1) {
            Vehiculos veh = new Barcos(temp, 1, j);
            Rojo.add(veh);
                }
                if (var == 2) {
            Vehiculos veh = new Barcos(temp, 8, j);
            Rojo.add(veh);
            }
            }
        }
        System.out.println(Azul.size());
        System.out.println(Rojo.size());
        //fin rojos
        //creacion de matrix
        
        Object[][] mapa = new Object[10][10];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "[ ]";
            }
        }
        
        for (int i = 0; i < Azul.size(); i++) {
            
            if (Azul.get(i) instanceof Barcos) {
            int x = ((Barcos)Azul.get(i)).getX();
            int y = ((Barcos)Azul.get(i)).getY();
            mapa[y][x] = ((Barcos)Azul.get(i));
            mapa[y][x] = "[B]";
            }
            if (Azul.get(i) instanceof Aviones) {
            int x = ((Aviones)Azul.get(i)).getX();
            int y = ((Aviones)Azul.get(i)).getY();
            mapa[y][x] = ((Aviones)Azul.get(i));
            mapa[y][x] = "[A]";
            }
            if (Azul.get(i) instanceof Submarinos) {
            int x = ((Submarinos)Azul.get(i)).getX();
            int y = ((Submarinos)Azul.get(i)).getY();
            mapa[y][x] = ((Submarinos)Azul.get(i));
            mapa[y][x] = "[S]";
            }
        }
        for (int i = 0; i < Rojo.size(); i++) {
            
            if (Rojo.get(i) instanceof Barcos) {
            int x = ((Barcos)Rojo.get(i)).getX();
            int y = ((Barcos)Rojo.get(i)).getY();
            mapa[y][x] = ((Barcos)Rojo.get(i));
            mapa[y][x] = "[b]";
            }
            if (Rojo.get(i) instanceof Aviones) {
            int x = ((Aviones)Rojo.get(i)).getX();
            int y = ((Aviones)Rojo.get(i)).getY();
            mapa[y][x] = ((Aviones)Rojo.get(i));
            mapa[y][x] = "[a]";
            }
            if (Rojo.get(i) instanceof Submarinos) {
            int x = ((Submarinos)Rojo.get(i)).getX();
            int y = ((Submarinos)Rojo.get(i)).getY();
            mapa[y][x] = ((Submarinos)Rojo.get(i));
            mapa[y][x] = "[s]";
            
            }
        }
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println("");
        }
    }
}
