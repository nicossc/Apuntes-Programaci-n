package pack5;
import java.util.*;
public class ImporteVentas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precio, peso, consumo, preciopeso;
		char letra, o;
		
		do {
		System.out.print("Introduce el precio base del electrodoméstico: ");
		precio=sc.nextInt();
		do {
			System.out.print("Introduce ahora la letra de su consumo energético: ");
			letra=sc.next().charAt(0);
			letra=Character.toUpperCase(letra);
		}while(letra!='A' & letra!='B' & letra!='C');
		do {
			System.out.print("Introduce el peso en kg del electrodoméstico: ");
			peso=sc.nextInt();
		}while(peso<0 | peso>79);
		
		if(letra=='A') {
			System.out.println("El consumo energético tiene la letra A, por lo tanto el precio adicional son 100 euros");
			consumo=100;
		}
		else if(letra=='B') {
			System.out.println("El consumo energético tiene la letra B, por lo tanto el precio adicional son 80 euros");
			consumo=80;
		}
		else {
			System.out.println("El consumo energético tiene la letra C, por lo tanto el precio adicional son 60 euros");
			consumo=60;
		}
		
		if(peso>=0 & peso<=19) {
			System.out.println("El precio añadido por el peso es de 10 euros");
			preciopeso=10;
		}
		else if(peso>=20 & peso<=49) {
			System.out.println("El precio añadido por el peso es de 50 euros");
			preciopeso=50;
		}
		else {
			System.out.println("El precio añadido por el peso es de 80 euros");
			preciopeso=80;
		}
		System.out.println("El precio final de este electrodoméstico es de "+(precio+consumo+preciopeso));
		System.out.println("");
		do {
			System.out.print("¿Quieres consultar otro electrodoméstico? (S/N): ");
			o=sc.next().charAt(0);
			o=Character.toUpperCase(o);
		}while(o!='N' & o!='S');
		}while(o=='S');
		
		System.out.println("Gracias por su visita");

	}

}
