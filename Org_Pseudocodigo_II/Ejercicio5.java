package pack2;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;
		float pi;
		
		System.out.println("Introduce el precio inicial de la compra");
		pi = sc.nextFloat();
		System.out.println("Introduce el mes de la compra (número)");
		mes = sc.nextInt();
		
		if (mes==10)
			System.out.println("Hay un descuento en Octubre, el precio final de la compra es " +(pi-pi*0.1));
		else
			System.out.println("No hay descuentos aplicables, por lo tanto el precio final es " +pi);

	}

}
