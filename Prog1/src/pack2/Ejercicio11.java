package pack2;
import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Introduce la nota");
		nota = sc.nextInt();
		
		switch (nota) {
		case 1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("Error en la nota");
		
		}

	}

}
