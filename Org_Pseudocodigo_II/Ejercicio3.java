package pack2;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Introduce la nota del alumno");
		nota = sc.nextInt();
		
		if (nota<5)
			System.out.println("La nota es Insuficiente");
		else if (nota==5)
			System.out.println("La nota es Suficiente");
		else if (nota==6)
			System.out.println("La nota es Bien");
		else if (nota<9)
			System.out.println("La nota es Notabale");
		else if (nota<=10)
			System.out.println("La nota es Sobresaliente");
		else
			System.out.println("Error en la nota");

	}

}
