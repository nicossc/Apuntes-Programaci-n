package pack4;
import java.util.*;
public class NumerosAmigos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, d=1, s1=0, s2=0;
		
		System.out.println("Introduce el primer número");
		n1=sc.nextInt();
		System.out.println("Introduce el segundo número");
		n2=sc.nextInt();
		
		System.out.print(n1+": ");
		while(d<=(n1/2)) {
			if(n1%d==0) {
				System.out.print(d+" ");
				s1+=d;
			}
			d++;
		}
		System.out.println("");
		d=1;
		
		System.out.print(n2+": ");
		while(d<=(n2/2)) {
			if(n2%d==0) {
				System.out.print(d+" ");
				s2+=d;
			}
			d++;
		}
		
		System.out.println("");
		if(s1==n2 & s2==n1)
			System.out.println(n1+ " y " +n2+ " son números amigos");
		else
			System.out.println(n1+ " y " +n2+ " no son números amigos");
	}

}
