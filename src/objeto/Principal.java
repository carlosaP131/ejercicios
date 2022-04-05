/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:este programa da dos opciones para calcular el area de un rectangulo o un triangulo 
 **                                                                                                 
 * *************************************************************************************************/
package objeto;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner; 
	private static Rectangulo area;
	private static Triangulo area2;
	public static void main(String[] args) {
	    int opc ;
	
		area = new Rectangulo();
		area2 = new Triangulo();
		scanner  = new Scanner(System.in);
		System.out.println("elija una opcion \n 1)-area de un rectangulo \n 2)area de un triangulo");
		opc = scanner.nextInt();
		switch(opc) { 
		case 1:
			System.out.print("ingrea la base: ");
		 area.setBase(scanner.nextDouble()); 
		System.out.print("ingrasa la altura: ");
		area.setAltura(scanner.nextDouble()); 
	     System.out.println("el area es: "+area.getArea());
	      break;
		case 2:
	     System.out.print("ingrea la base del triangulo: ");
			 area.setBase(scanner.nextDouble()); 
			System.out.print("ingrasa la altura del triangulo : ");
			area.setAltura(scanner.nextDouble()); 
		     System.out.println("el area es del triangulo: "+area.getArea());
			break;
		}
	}

}
