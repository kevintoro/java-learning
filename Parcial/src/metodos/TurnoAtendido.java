/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author 
 */
public class TurnoAtendido 
{
    private String nombre, cc, value, data;

    public TurnoAtendido(String data, String nombre, String cc, String value) {
        this.nombre = nombre;
        this.cc = cc;
        this.value = value;
        this.data = data;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCc() {
        return cc;
    }

    public String getValue() {
        return value;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}