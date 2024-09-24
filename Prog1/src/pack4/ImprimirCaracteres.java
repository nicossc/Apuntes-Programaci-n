package pack4;
import java.util.*;
public class ImprimirCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Introduce un caracter");
		c = sc.next().charAt(0);
		while(c != '*') {
			System.out.println(c);
			System.out.println("Introduce otro caracter");
			c = sc.next().charAt(0);
		}
		System.out.println("Fin del programa");

	}

}
