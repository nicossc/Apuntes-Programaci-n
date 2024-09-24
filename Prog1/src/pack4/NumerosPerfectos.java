package pack4;
import java.util.*;
public class NumerosPerfectos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s=0, d=1;
		System.out.println("Introduce un número");
		n=sc.nextInt();
		System.out.print(n+": ");
		while(d<=(n/2)) {
			if(n%d==0) {
				System.out.print(d+" ");
				s+=d;
			}
			d++;
		}
		System.out.println();
		if(s==n)
			System.out.println(n+ " es un número perfecto");
	}

}
