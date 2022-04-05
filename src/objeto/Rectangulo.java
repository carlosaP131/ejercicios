/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:este programa para calcular el area de un rectangulo 
 **                                                                                                 
 * *************************************************************************************************/
package objeto;

public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {

		this.base = base;
		this.altura = altura;
	}

	public double getArea() {
		return this.base * this.altura;
	}

	public void imprimir() {
		System.out.println("el area es: " + this.getArea());
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
