package ejercicio12;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner;
	public static FacturaCompleta fac;

	public static void main(String[] args) {
		String opc1;
		String opc2;
		fac = new FacturaCompleta();
		scanner = new Scanner(System.in);
		System.out.println("introdusca el tipo de iva: ");
		opc1 = scanner.nextLine();
		switch (opc1) {
		case "general":

		}
	}

}
