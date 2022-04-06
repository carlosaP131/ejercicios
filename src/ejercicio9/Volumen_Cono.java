/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:volumen de un cono   
 **                                                                                                 
 * *************************************************************************************************/

package ejercicio9;

public class Volumen_Cono {
    private double pi  = 3.1416;
    private double rad;
    private double alt;
    public Volumen_Cono() {
    	
    }
	public Volumen_Cono(double pi, double rad, double alt) {
		super();
		this.pi = pi;
		this.rad = rad;
		this.alt = alt;
	}
	public double getVolumen() {
		return (this.pi*(this.rad*this.rad)*this.alt)/3;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getRad() {
		return rad;
	}
	public void setRad(double rad) {
		this.rad = rad;
	}
	public double getAlt() {
		return alt;
	}
	public void setAlt(double alt) {
		this.alt = alt;
	}
	
}
