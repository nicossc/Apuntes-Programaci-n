package pack2;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, disc;
		
		System.out.println("ax^2+bx+c=0");
		System.out.println("Introduce el primer valor");
		a = sc.nextDouble();
		System.out.println("Introduce el segundo valor");
		b = sc.nextDouble();
		System.out.println("Introduce el tercer valor");
		c = sc.nextDouble();
		
		disc = Math.pow(b, 2)-4*a*c;
		
		if (disc==0)
			System.out.println("El resultado de esta ecuación es " +(-b/(2*a)));
		else if (disc<0)
			System.out.println("La ecuación no tiene soluciones reales");
		else {
			System.out.println("Las soluciones de la ecuación son:");
			System.out.println("x1= " +(-b + Math.sqrt(disc)) / (2 * a));
			System.out.println("x2= " +(-b - Math.sqrt(disc)) / (2 * a));
		
		}
	}

}
