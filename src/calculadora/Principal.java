/*****************************************************************************
 *Autor:carlos Aurelio Alcántara Pérez 
 *Fecha de creacion: 05-04-2022 ***
 *Fecha de actualizacion:05-04-2022
 *Descripicion:realiza operaciones de dos numeros introducidos por el usuario  
 **                                                                                                 
 * *************************************************************************************************/

package calculadora;
import java.util.Scanner;
public class Principal {
	private static Scanner scanner; 
	public static void main(String[] args) {
		scanner = new Scanner(System.in); 
		System. out. print( "pon un numero  "  );
		double n1 = scanner.nextInt();
    	System. out. print( "pon el segundo numero  "  );
    	double n2 = scanner.nextInt();
		//double n1 = 10;
		//double n2 = 5;
		        
		//suma
		Suma sum = new Suma(n1,n2);
		sum.mostrarResultado();
		        
		//resta
		Resta res = new Resta(n1,n2);
		res.mostrarResultado();
		        
		//multiplicacion
		Multiplicacion mul = new Multiplicacion(n1,n2);
		mul.mostrarResultado();
		        
		//division
		Divicion div = new Divicion(n1,n2);
		div.mostrarResultado();

	}

}
