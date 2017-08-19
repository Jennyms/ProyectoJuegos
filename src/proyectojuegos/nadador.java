/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

/**
 *
 * @author jenni
 */
public class nadador {
// this variables are private for them to be modified
    private int coorX, coorY, velocidad, avance;
    private long tiempo;
//    private String nombre;

    public nadador(int codigo, int coorX, int coorY, long tiempo, int velocidad, String nombre) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.tiempo = tiempo;
        this.velocidad = velocidad;
//        this.nombre = nombre;
    }
// this method return the progress that the swimmer is having
    public int getAvance() {
        return avance;
    }
// this method is always changing the progress that the swimmer is having
    public void setAvance(int avance) {
        this.avance = avance;
    }
//this method get and return the coordinate of each swimmer in the "x" position
    public int getCoorX() {
        return coorX;
    }
// this method is always changing the coordinate of each swimmer in the "x" position that they are getting
    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }
//this method get and return the coordinate of each swimmer in the "y" position
    public int getCoorY() {
        return coorY;
    }
// this method is always changing the coordinate of each swimmer in the "y" position that they are getting
    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }
//this method get and return the time of each swimmer
    public long getTiempo() {
        return tiempo;
    }
//this method set and return the time of each swimmer
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
//this method get and return the swimming speed of each swimmer 
    public int getVelocidad() {
        return velocidad;
    }
//this method set and return the swimming speed of each swimmer
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }  
}
