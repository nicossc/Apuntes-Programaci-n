package pack3;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4;
		
		System.out.println("Introduce las 4 notas");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		if (n1<n2 & n1<n3 & n1<n4)
			System.out.println("Se elimina la primera nota: " +n1+ ". El promedio final es " +((n2+n3+n4)/3));
		else if (n2<n1 & n2<n3 & n2<n4)
			System.out.println("Se elimina la primera nota: " +n2+ ". El promedio final es " +((n1+n3+n4)/3));
		else if (n3<n2 & n3<n1 & n3<n4)
			System.out.println("Se elimina la primera nota: " +n3+ ". El promedio final es " +((n2+n1+n4)/3));
		else if (n4<n2 & n4<n3 & n4<n1)
			System.out.println("Se elimina la primera nota: " +n4+ ". El promedio final es " +((n2+n3+n1)/3));

	}

}
