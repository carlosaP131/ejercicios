/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:calcula el salario de un trabajador    
 **                                                                                                 
 * *************************************************************************************************/

package ejercicio8;

import java.util.Scanner;

public class Principal {
	public static Scanner scanner;
	public static Salario paga;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		paga = new Salario();
		System.out.print("�cuantas horas trabajo el empleado? ");
		paga.setHoras(scanner.nextInt());
		System.out.println("el salario total despues de " + paga.getHoras() + " horas es " + paga.getpaga() + " euros");

	}

}
