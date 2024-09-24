package pack1;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi, pf, d;
		
		System.out.println("Introduce el precio inicial");
		pi = sc.nextDouble();
		
		d = pi-pi*0.1;
		pf = d+d*0.21;
		
		System.out.println("El precio inicial es " +pi);
		System.out.println("El precio final aplicado el 10% de descuento y el 21% de IVA es " +pf);

	}

}
