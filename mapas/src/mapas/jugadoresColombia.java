/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mapas;

/**
 *
 * @author matias
 */
public class jugadoresColombia {
    

	private int dorsal;
	private String nombre;
	private String demarcacion;

	public jugadoresColombia() {
	}

	public jugadoresColombia(int dorsal, String nombre, String demarcación) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcación;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcación() {
		return demarcacion;
	}

	public void setDemarcación(String demarcación) {
		this.demarcacion = demarcación;
	}

	@Override
	public String toString() {
		return this.dorsal+"  --  "+this.nombre+"  --  "+this.demarcacion;
	}

}
    

