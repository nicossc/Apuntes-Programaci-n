package pack2;
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h, hx, p, im;
		
		System.out.println("Introduce las horas trabajadas");
		h = sc.nextDouble();
		
		if (h<=35) {
			p=h*50;
			System.out.println("El pago corresponde a " +p+ " euros");}
		else {
			hx=h-35;
			p=35*50+hx*50*1.5;
		}
		
		if (p<20000)
			System.out.println("No hay impuesto a pagar, el salario correspondiente es " +p+ " euros");
		else
			System.out.println("Se debe pagar un 20% de impuestos, el salario correspondiente equivale a " +(p-p*0.2)+ " euros");

	}

}
