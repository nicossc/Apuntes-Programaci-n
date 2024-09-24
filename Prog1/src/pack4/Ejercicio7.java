package pack4;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c, p, i;
		
		p=0;
		i=0;
		for (c=1;c<=10;c+=1) {
			System.out.println("Introduce un número");
			n=sc.nextInt();
			if(n%2==0) {
				System.out.println(n+ " es par");
				p+=1;}
			else {
				System.out.println(n+ " es impar");
				i+=1;}
		System.out.println("Pares: " +p+ ". Impares: " +i);
		}

	}

}
