/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class fecha {
    int dia;
    int mes;
    int anual;

    public fecha(int dia, int mes, int anual) {
        this.dia = dia;
        this.mes = mes;
        this.anual = anual;
    }

    public fecha() {
    }

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnual() {
        return anual;
    }

    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnual(int anual) {
        this.anual = anual;
    }

}
