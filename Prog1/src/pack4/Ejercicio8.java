package pack4;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c=0;
		
		System.out.println("Introduce un n�mero");
		n=sc.nextInt();
		while(n!=0) {
			System.out.println(n);
			System.out.println("Introduce un n�mero");
			n=sc.nextInt();
			c++;
		}
		System.out.println("N�meros distintos de 0: " +c);

	}

}
