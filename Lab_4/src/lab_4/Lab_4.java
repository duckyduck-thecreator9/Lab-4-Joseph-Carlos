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
                boolean pos = true;
                int x;
                int y;
                String ficha = null;
                //validacion rojos
                for (int g = 0; g < Rojo.size(); g ++) {
                if (Rojo.get(g) instanceof Barcos) {
            x = ((Barcos)Rojo.get(g)).getX();
            y = ((Barcos)Rojo.get(g)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Barcos)Rojo.get(g));
            ficha = "[b]";
            pos = false;
            }
            }
            if (Rojo.get(g) instanceof Aviones) {
            x = ((Aviones)Rojo.get(g)).getX();
            y = ((Aviones)Rojo.get(g)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Aviones)Rojo.get(g));
            ficha = "[a]";
            pos = false;
            }
            }
            if (Rojo.get(g) instanceof Submarinos) {
            x = ((Submarinos)Rojo.get(g)).getX();
            y = ((Submarinos)Rojo.get(g)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Submarinos)Rojo.get(g));
            ficha = "[s]";
            pos = false;
            }
            }
            }
            //fin rojos
            //Validacion azules
                for (int m = 0; m < Azul.size(); m ++) {
            if (Azul.get(m) instanceof Barcos) {
            x = ((Barcos)Azul.get(m)).getX();
            y = ((Barcos)Azul.get(m)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Barcos)Azul.get(m));
            ficha = "[B]";
            pos = false;
            }
            }
            if (Azul.get(m) instanceof Aviones) {
            x = ((Aviones)Azul.get(m)).getX();
            y = ((Aviones)Azul.get(m)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Aviones)Azul.get(m));
            ficha = "[A]";
            pos = false;
            }
            }
            if (Azul.get(m) instanceof Submarinos) {
            x = ((Submarinos)Azul.get(m)).getX();
            y = ((Submarinos)Azul.get(m)).getY();
            if (x == j && y == i) {
            mapa[y][x] = ((Submarinos)Azul.get(m));
            ficha = "[S]";
            pos = false;
            }
            }
                }    
                if (pos == true) {
                    System.out.print("[ ]");
                } else if (pos == false) {
                    System.out.print(ficha);
                }
            }
            System.out.println("");
        }
    }
}
