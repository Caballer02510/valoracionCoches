/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW2-PROFESOR
 */
public class Utilidades {
    public static ArrayList<String> CalculaAnios(){
        int anioActual=2021;
        ArrayList<String> listaAnios = new ArrayList<String>();
        for ( int i=0; i<=20;i++){
            int anio=anioActual-i;
            listaAnios.add(String.valueOf(anio));
        }
        return listaAnios;
    }
    public static ArrayList<ValorPorAnio> getValoresPorAnio (double precioNuevo,double precioDesguace, 
            int anio_matriculacion) {
        ArrayList<ValorPorAnio> listaValoresPorAnio = new ArrayList<ValorPorAnio>();
        int anio_actual = 2021;
        for ( int a = anio_matriculacion; a<=anio_actual; a++ ){
            double valorN = precioNuevo - ( precioNuevo-precioDesguace )* (a -anio_matriculacion )/20;
            ValorPorAnio miValorPorAnio = new ValorPorAnio(a,valorN);
            listaValoresPorAnio.add(miValorPorAnio);
        }
        return listaValoresPorAnio;
    }
}
