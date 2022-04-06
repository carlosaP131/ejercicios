/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:convierte de mb a kb  
 **                                                                                                 
 * *************************************************************************************************/

package convertor2;

public class Mbakb {
	private double valor_kb;
	private double valor_mb = 0.001;

	public Mbakb() {

	}

	public Mbakb(double valor_kb, double valor_mb) {

		this.valor_kb = valor_kb;
		this.valor_mb = valor_mb;
	}

	public double getValormb() {
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
