package pack1;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x, y;
		
		System.out.println("Y=3*X+2+7*X-15");
		System.out.println("Introduce el valor de X");
		x = sc.nextFloat();
		
		y = 3*x+2+7*x-15;
		System.out.println("La solución para el valor de X introducido es " +y);

	}

}
