package pack4;
import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p=0, n=1, e;
		System.out.println("¿Qué número quieres elevar?");
		n=sc.nextInt();
		System.out.println("Hasta qué número quieres elevarlo?");
		e=sc.nextInt();
		while(p<=e) {
			System.out.println(n+ "^" +p+ "=" +Math.pow(n, p));
			p++;
		}
		
	}

}
