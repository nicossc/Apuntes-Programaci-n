package pack2;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kg, pi, p;
		System.out.println("Introduce el precio por kilogramo de manzanas");
		pi=sc.nextDouble();
		System.out.println("Introduce los kilogramos de manzanas");
		kg=sc.nextDouble();
		
		if (kg>0 & kg<=2) {
			p=kg*pi;
			System.out.println("No hay descuentos aplicables, el precio final es " +p);}
			else if (kg>=2.01 & kg<=5) {
				p=kg*pi-(kg*pi)*0.1;
				System.out.println("10% de descuento, el precio final es " +p);}
				else if (kg>=5.01 & kg<=10) {
					p=kg*pi-(kg*pi)*0.15;
					System.out.println("15% de descuento, el precio final es " +p);}
					else {
						p=kg*pi-(kg*pi)*0.1;
						System.out.println("20% de descuento, el precio final es " +p);}
					}
				
		}

