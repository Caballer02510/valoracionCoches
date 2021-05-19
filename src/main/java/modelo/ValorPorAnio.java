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
public class ValorPorAnio {
    private int anio;
    private double valorAnual;

    public ValorPorAnio(int anio, double valorAnual) {
        this.anio = anio;
        this.valorAnual = valorAnual;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValorAnual(double valorAnual) {
        this.valorAnual = valorAnual;
    }

    public int getAnio() {
        return anio;
    }

    public double getValorAnual() {
        return valorAnual;
    }
    
}
