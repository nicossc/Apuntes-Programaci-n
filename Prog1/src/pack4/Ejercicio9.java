package pack4;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el número");
		n = sc.nextInt();
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				System.out.println(i+ " es divisor de " +n);
		}
		System.out.println(n+ " es divisor de " +n);

	}

}
