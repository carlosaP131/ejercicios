/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:da la opcion de escojer entre convertir de kb a mb y viceversa   
 **                                                                                                 
 * *************************************************************************************************/

package convertor2;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner;
	private static Mbakb kb;
	private static Kbamb mb;

	public static void main(String[] args) {
		int opc;
		scanner = new Scanner(System.in);
		kb = new Mbakb();
		mb = new Kbamb();
		System.out.println("elija una opcion \n 1)-convertir de Kb a Mb \n 2)conertir de Mb a Kb");
		opc = scanner.nextInt();
		switch (opc) {
		case 1:
			System.out.println("cuantos Kb desea convertir: ");
			kb.setValor_kb(scanner.nextDouble());
			System.out.println("el valor en Mb es  " + kb.getValormb());
			break;
		case 2:
			System.out.println("cuantos Mb desea convertir: ");
			mb.setValor_mb(scanner.nextDouble());
			System.out.println("el valor en Kb es  " + mb.getValorkb());
			break;
		}
	}

}
