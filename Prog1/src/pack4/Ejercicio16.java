package pack4;
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, v;
		
		System.out.println("Introduce el número");
		n = sc.nextInt();
		v=n-1;
		if(n==0)
			System.out.println("El factorial de 0 es 1");
		else {
			System.out.print(n+"! = ");
			System.out.print(n+" ");
		while(v>0) {
			System.out.print("x ");
			System.out.print(v+" ");
			n*=v;
			v-=1;
		}
		System.out.println("= " +n);
		}
	}
}
