/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:convierte de kb a mb   
 **                                                                                                 
 * *************************************************************************************************/

package convertor2;

public class Kbamb {
	private double valor_kb = 1000 ;
	private double valor_mb;

	public Kbamb() {

	}

	public Kbamb(double valor_kb, double valor_mb) {

		this.valor_kb = valor_kb;
		this.valor_mb = valor_mb;
	}

	public double getValorkb() {
		return this.valor_kb * this.valor_mb;
	}

	public double getValor_kb() {
		return valor_kb;
	}

	public void setValor_kb(double valor_kb) {
		this.valor_kb = valor_kb;
	}

	public double getValor_mb() {
		return valor_mb;
	}

	public void setValor_mb(double valor_mb) {
		this.valor_mb = valor_mb;
	}

}
