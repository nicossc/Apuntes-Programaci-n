package pack4;
import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int v=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Introduce un caracter");
			c=sc.next().charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				v++;
		}
		System.out.println("Hay " +v+ " vocales");

	}

}
