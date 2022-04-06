/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:recive el total y saca el iva luego lo suma al total para sacar el total neto 
 **                                                                                                 
 * *************************************************************************************************/

package factura;


public class Principal {
	
	private static Factura tot =  new Factura();
	

	public static void main(String[] args) {
		
		
		
		tot.setSubt(1000.0);
		System.out.println("subtotal sin iva $"+tot.getSubt());
		System.out.println("iva              $"+tot.getiva());
		System.out.println("total            $"+tot.gettot());
	}
}
