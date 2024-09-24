import java.util.Scanner;
public class ExamenA2 {
 public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int edad, contalum = 0, menor = 999999, pos = 0, suma=0, mayor=0;
	double media;
	System.out.println("Aplicación para Calcular datos Estadísticos");
	System.out.println("*******************************************");
	
	System.out.println("Introducir una edad: ");
	edad = sc.nextInt();
	/* Comprobar que la edad esta entre 12-25
	 * y que no sea menor que 0 */
	while ( edad >= 0 && (edad < 12 || edad > 25) ) {
		System.out.println("Dato ingresado no válido. Ingrese una edad(12 - 25 años):" );
		edad = sc.nextInt();
	}
	/* Si la edad es mayor que 0 entra al bucle */
	while (edad >= 0) {
		    suma = suma + edad;	
			contalum++;
			
			if (edad < menor) {
				menor = edad;
				pos = contalum;
			}
			if (edad >= 18)
				mayor++;
			
			System.out.println("Alumno: "+contalum + " Edad: " + edad);
			System.out.println();
			
			System.out.println("Introducir una edad: ");
			edad = sc.nextInt();
			while ( edad >= 0 && (edad < 12 || edad > 25) ) {
				System.out.println("Dato ingresado no válido. Ingrese una edad(12 - 25 años):" );
				edad = sc.nextInt();
			}
		}
	if (contalum != 0){
        media= (double)suma/contalum;
		System.out.println("La media de edad del total de alumnos ingresados es: " + media);
		System.out.println("Hay " + mayor + " alumnos que son mayores de edad.");
	    System.out.println("El alumno con menor edad esta en el lugar: " + pos);

 }
	else System.out.println("Sin datos");
}
}