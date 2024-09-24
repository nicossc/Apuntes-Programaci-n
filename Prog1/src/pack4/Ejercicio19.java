package pack4;
import java.util.*;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Introduce un número");
			n=sc.nextInt();
			if(n==5)
				c=1;
		}
		if(c==1)
			System.out.println("Has introducido al menos un número 5");
		else
			System.out.println("No has introducido ningún número 5");

	}

}
