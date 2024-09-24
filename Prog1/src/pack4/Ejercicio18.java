package pack4;
import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc=0;
		
		System.out.println("1. Altas");
		System.out.println("2. Bajas");
		System.out.println("3. Modificaciones");
		System.out.println("4. Consultas");
		System.out.println("5. Salir");
		
		while(opc!=5) {
			opc=sc.nextInt();
			switch (opc){
			case 1:
				System.out.println("Altas");
				break;
			case 2:
				System.out.println("Bajas");
				break;
			case 3:
				System.out.println("Modificaciones");
				break;
			case 4:
				System.out.println("Consultas");
				break;
			case 5:
				System.out.print("");
				break;
			default:
				System.out.println("Por favor, introduce una opción válida");	
			}
			System.out.println("1. Altas");
			System.out.println("2. Bajas");
			System.out.println("3. Modificaciones");
			System.out.println("4. Consultas");
			System.out.println("5. Salir");
			if (opc==5)
				System.out.println("Gracias por su visita");
		}
		
	}

}
