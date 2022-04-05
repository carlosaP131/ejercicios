/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:este programa da dos opciones para convertir dolares a pesos y viceversa 
 **                                                                                                 
 * *************************************************************************************************/
package convertor;
import java.util.Scanner;

public class Principal {
	private static Scanner scanner; 
	private static Dolpes val1;
	private static Pesdol val2;
	public static void main(String[] args) {
		int opc ;
		val1 = new Dolpes();
		val2 = new Pesdol();
		scanner = new Scanner(System.in);
		System.out.println("elija una opcion \n 1)-convertir dolares \n 2)conertir pesos");
		opc = scanner.nextInt();
		switch(opc) { 
		case 1:
			System.out.println("cuantos dolares desea convertir: ");
			val1.setValor_dolares(scanner.nextDouble());
			System.out.println("el valor en pesos es $ "+ val1.getValordol() );
			break;
		case 2:
			System.out.println("cuantos pesos desea convertir: ");
			val2.setValor_peso(scanner.nextDouble());
			System.out.println("el valor en pesos es $ "+ val2.getValorpes() );
			break;
		}
		
	}

}
