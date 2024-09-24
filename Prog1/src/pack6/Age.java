package pack6;
import java.util.*;
public class Age {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int edad, alum = 0, men = 99, pos = 0, sum=0, may=0;
		double media;
		
		System.out.println("Introduce una edad: ");
		edad = sc.nextInt();
		// Comprobar edad
		while ( edad >= 0 && (edad < 12 || edad > 25) ) {
			System.out.println("ERROR. Introduce una edad (12 - 25 años): ");
			edad = sc.nextInt();
		}
		// Si la edad es correcta entra al bucle
		while (edad >= 0) {
			alum++;
			sum = sum + edad;	
			if (edad < men) {
				men = edad;
				pos = alum;
			}
			if (edad >= 18)
				may++;
				
			//Datos alumno
			System.out.println("Alumno: "+alum + ". Edad: " + edad);
			System.out.println();
				
			//Siguiente alumno
			System.out.println("Introduce una edad: ");
			edad = sc.nextInt();
			while ( edad >= 0 && (edad < 12 || edad > 25) ) {
				System.out.println("ERROR. Introduce una edad (12 - 25 años): ");
				edad = sc.nextInt();
			}
		}
		
		//Datos finales
		if (alum != 0){
	        media= (double)sum/alum;
			System.out.println("La media de edad de los alumnos es: " + media);
			System.out.println(may+ " alumnos son mayores de edad.");
		    System.out.println("El alumno con menor edad es el número: " + pos);

	 }
		else System.out.println("No se han introducido datos");
	}

}
