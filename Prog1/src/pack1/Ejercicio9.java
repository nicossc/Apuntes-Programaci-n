package pack1;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c1, c2;
		
		System.out.println("Introduce el valor del primer cateto");
		c1 = sc.nextFloat();
		System.out.println("Introduce el valor del segundo cateto");
		c2 = sc.nextFloat();
		
		System.out.println("La hipetunsa de este triángulo es " +Math.sqrt(Math.pow(c1, 2)+ Math.pow(c2, 2)));

	}

}