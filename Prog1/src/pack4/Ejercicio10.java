package pack4;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i=2, c=0;
		
		System.out.println("Introduce el número");
		n = sc.nextInt();
		
		while(i<=n/2) {
			if(n%i==0)
				c++;
			i++;
		}
		if(c==0)
			System.out.println(n+ " es primo");
		else
			System.out.println(n+ " no es primo");

	}

}
