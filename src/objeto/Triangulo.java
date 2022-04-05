/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:este programa da dos opciones para calcular el area de  un triangulo 
 **                                                                                                 
 * *************************************************************************************************/
package objeto;

public class Triangulo {
	private double base;
    private double altura;

    public Triangulo(){
   	 
    }
	public Triangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	public double getAreaT() {
		return ((this.base*this.altura)/2);
	}
	public void imprimir() {
		System.out.println("el area es: "+this.getAreaT());
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
