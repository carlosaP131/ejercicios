package ejercicio9;
import java.util.Scanner;

public class Principal {
	private static Scanner scanner;
	private static Volumen_Cono vol;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		vol = new Volumen_Cono();
		System.out.println("se calcula el volumen de un cono");
		System.out.print("dame la altura");
		vol.setAlt(scanner.nextDouble());
		System.out.print("dame el radio");
		vol.setRad(scanner.nextDouble());
		System.out.println("el volumen es :"+vol.getVolumen());

	}

}
