package pack4;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i=1,c=0;
		
		while(i<=10) {
			System.out.println("Introduce un número");
			n=sc.nextInt();
			if(n>0)
				c++;
			i++;
		}
		System.out.println("Números positivos: " +c);
	}
}