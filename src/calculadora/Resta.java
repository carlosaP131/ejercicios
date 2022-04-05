/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:resta de dos numeros 
 **                                                                                                 
 * *************************************************************************************************/

package calculadora;

public class Resta extends Operacion {

	double resta;

	public Resta(double n1, double n2) {

		super(n1, n2, '-');
		this.resta = n1 - n2;
		this.res = this.resta;
	}

	public void mostrarResultado() {
		System.out.println(this.n1 + " " + this.operacion + " " + this.n2 + " = " + this.res);
	}
}