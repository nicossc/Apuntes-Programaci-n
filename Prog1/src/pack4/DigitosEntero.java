package pack4;
import java.util.*;
public class DigitosEntero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, d=0;
		System.out.println("Introduce un n�mero");
		n=sc.nextInt();
		while(n!=0) {
			n=n/10;
			d++;
		}
		System.out.println("N�mero de d�gitos: " +d);
		
	}

}
