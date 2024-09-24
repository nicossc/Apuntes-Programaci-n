package pack2;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, p;
		
		System.out.println("Introduce la cantidad de llantas que se compran");
		c = sc.nextDouble();
		
		if (c<5) {
			System.out.println("30.000 euros por llanta");
			p=c*30000;}
			else if (c<10) {
				System.out.println("25.000 euros por llanta");
				p=c*25000;}
				else {
					System.out.println("20.000 euros por llanta");
					p=c*20000;
		}
		System.out.println("El precio final de la compra es " + p);

	}

}