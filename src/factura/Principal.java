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
