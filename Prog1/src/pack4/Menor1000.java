package pack4;
import java.util.*;
public class Menor1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1000, p=0, i=0, mayor, menor, c=0;
		System.out.println("Introduce un número");
		n=sc.nextInt();
		mayor=n;
		menor=n;
		while(n>=1000) {
			c++;
			if(n<menor)
				menor=n;
			else if(n>mayor)
				mayor=n;
			if(n%2==0)
				p++;
			else
				i++;
			System.out.println("Introduce un número");
			n=sc.nextInt();
		}
		System.out.println("El total de números es: " +c);
		System.out.println("La cantidad de números pares es: " +p);
		System.out.println("La cantidad de números impares es: " +i);
		System.out.println("El número mayor es: " +mayor);
		System.out.println("El número menor es: " +menor);

	}

}
