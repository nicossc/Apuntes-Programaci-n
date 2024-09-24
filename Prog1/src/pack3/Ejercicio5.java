package pack3;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char fig;
		
		System.out.println("Introduce la letra de la figura a calcular (E=Triángulo equilátero C=Circunferencia R=Rectángulo H=Hexágono");
		fig = sc.next().charAt(0);
		
		switch (fig) {
		case 'E':
			double lado;
			System.out.println("Introduce el valor del lado");
			lado = sc.nextDouble();
			System.out.println("El valor del área de este triángulo es " +(lado*Math.sqrt(3/4*Math.pow(lado, 2))));
			break;
		case 'C':
			double rad;
			System.out.println("Introduce el valor del radio");
			rad = sc.nextDouble();
			System.out.println("El valor del área de esta circunferencia es " +(3.14*Math.pow(rad, 2)));
			break;
		case 'R':
			double b,h;
			System.out.println("Introduce la medida de la base");
			b=sc.nextDouble();
			System.out.println("Introduce la medida de la altura");
			h=sc.nextDouble();
			System.out.println("El valor del área de este rectángulo es " +(b*h));
			break;
		case 'H':
			double lado1;
			System.out.println("Introduce la medida del lado");
			lado1 = sc.nextDouble();
			System.out.println("El valor del área de este hexágono es " +(6*(Math.sqrt(3/4*Math.pow(lado1, 2))*lado1/2)));;
			
		}

	}

}
