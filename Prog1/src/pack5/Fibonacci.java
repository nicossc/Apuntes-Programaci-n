package pack5;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=1, n3, c=0, tot;
		System.out.println("¿Cuantos valores quieres mostrar?");
		tot=sc.nextInt();
		System.out.print("0 1 ");
		while(c<tot-2) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+ " ");
			c++;
		}

	}

}
