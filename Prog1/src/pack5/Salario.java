package pack5;
import java.util.*;
public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, hx;
		double p, pm=0;
		
		System.out.println("Introduce el sueldo por hora");
		p = sc.nextInt();
		
		for(int i=1;i<=4;i++) {
			System.out.println("Introduce las horas de trabajo de la semana "+i);
			h = sc.nextInt();
			while(h<1) {
				System.out.println("Has introducido un número negativo, introduce un valor válido para las horas");
			}
			if (h<=35) {
				pm=h*p;
			}
			else {
				hx=h-35;
				pm=35*p+hx*p*1.5;
			}
			pm+=pm;
		}
		if(pm<600)
			System.out.println("No se pagan impuestos, el sueldo corresponde a "+pm+"€");
		else if(pm>=600 & pm<=1000)
			System.out.println("Hay un 20% de impuestos, el sueldo final corresponde a "+(pm-(pm*0.2))+"€");
		else
			System.out.println("Hay un 30% de impuestos, el sueldo final corresponde a "+(pm-(pm*0.3))+"€");

	}

}
