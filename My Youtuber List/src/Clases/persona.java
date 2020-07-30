/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class persona {
    
    int idpersona;
    String nombres;
    fecha fechanacimiento;

    public persona(int idpersona, String nombres, fecha fechanacimiento) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.fechanacimiento = fechanacimiento;
    }

    public persona() {
    }

    public int getIdpersona() {
        return idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public fecha getFechanacimiento() {
        return fechanacimiento;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFechanacimiento(fecha fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
}
