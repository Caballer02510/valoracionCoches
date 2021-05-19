/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW2-PROFESOR
 */
public class Valoracion {
    private double precioNuevo;
    private double precioDesguace;
    int anioMat;
    double valorActual;

    public Valoracion(double precioNuevo, double precioDesguace, int anioMat) {
        this.precioNuevo = precioNuevo;
        this.precioDesguace = precioDesguace;
        this.anioMat = anioMat;
        int edad=2021-anioMat;
        valorActual = precioNuevo - (precioNuevo-precioDesguace )*edad/20;
        
    }

    public double getPrecioNuevo() {
        return precioNuevo;
    }

    public void setPrecioNuevo(double precioNuevo) {
        this.precioNuevo = precioNuevo;
    }

    public double getPrecioDesguace() {
        return precioDesguace;
    }

    public void setPrecioDesguace(double precioDesguace) {
        this.precioDesguace = precioDesguace;
    }

    public int getAnioMat() {
        return anioMat;
    }

    public void setAnioMat(int anioMat) {
        this.anioMat = anioMat;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
    
    
}
