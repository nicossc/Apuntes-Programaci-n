package pack2;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km, p, iva;
		
		System.out.println("Introduce el número de kilómetros");
		km = sc.nextDouble();
		
		if (km==300) {
			iva=30000*0.16;
			System.out.println("El precio es de 300.000 euros y el IVA ya incluido equivale a " +iva);}
			else if (km<=1000) {
				p=300000+(km-300)*15000;
				iva = p*0.16;
				System.out.println("El precio es de " +p+ " euros y el IVA ya incluido equivale a " +iva);}
				else {
					p=300000+700*15000+(km-1000)*10000;
					iva=p*0.16;
					System.out.println("El precio es de " +p+ " euros y el IVA ya incluido equivale a " +iva);
		}

	}

}
