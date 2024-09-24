package pack5;
import java.util.*;
public class VerificarEmpleado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		boolean d2, d3, d5;
		char o;
		
		do {
		d2=false; d3=false; d5=false;
		System.out.println("Introduzca su código de acceso");
		code = sc.nextInt();
		while(code<100 | code>999) {
			System.out.println("Código inválido, introduzca un código correcto");
			code = sc.nextInt();
		}
		if(code%2==0)
			d2=true;
		if(code%3==0)
			d3=true;
		if(code%5==0)
			d5=true;
		
		if(d2 & d3 & d5)
			System.out.println("Director general, acceso permitido");
		else if(!d2 & d3 & d5)
			System.out.println("Directivo, acceso permitido");
		else if (d2 & !d3 & !d5)
			System.out.println("Staff, acceso permitido");
		else if (!d2 & !d3 & !d5)
			System.out.println("Seguridad, acceso permitido");
		else
			System.out.println("No se puede verificar su categoría, acceso denegado");
		
		do {
			System.out.println("¿Nuevo acceso? (S/N)");
			o=sc.next().charAt(0);
			o=Character.toUpperCase(o);
		}while(o!='N' & o!='S');
		}while(o=='S');
	}

}
