/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion: multiplica el salario dado por las horas de trabajo    
 **                                                                                                 
 * *************************************************************************************************/

package ejercicio8;

public class Salario {
	private double salario = 12.0;
	private int horas;

	public Salario() {

	}

	public Salario(double salario, int horas) {

		this.salario = salario;
		this.horas = horas;
	}

	public double getpaga() {
		return this.salario * this.horas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
