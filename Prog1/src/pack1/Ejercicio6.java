package pack1;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota1, nota2, nota3;
		float media;
		
		System.out.println("Introduce la nota de la primera evaluaci�n");
		nota1 = sc.nextInt();
		System.out.println("Introduce la nota de la segunda evaluaci�n");
		nota2 = sc.nextInt();
		System.out.println("Introduce la nota de la tercera evaluaci�n");
		nota3 = sc.nextInt();
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("La media final es " +media);

	}

}
