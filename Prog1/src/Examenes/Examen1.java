package Examenes;
import java.util.*;
public class Examen1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pres=1, cuotas, interes;
		char ries;
		
		System.out.println("Introduce el importe del préstamo");
		pres=sc.nextInt();
		
		//Validar que el préstamo sea positivo
		while(pres<0) {
			System.out.println("Has introducido un valor negativo, por favor, introduce un préstamo válido");
				pres=sc.nextInt();
		}
		
		//Repetir hasta que el valor del préstamo sea 0
		while(pres!=0) {
		
		//Calcular la cantidad de cuotas en las que se debe pagar
		if(pres<1000)
			cuotas=1;
		else if(pres>=2000 & pres<=3000)
			cuotas=2;
		else if(pres>5000)
			cuotas=3;
		else
			cuotas=5;
		
		//Preguntar el riesgo del préstamo y forzar el caracter a mayúscula
		System.out.println("¿Es el préstamo de alto (X), medio(M) o bajo(B) riesgo?");
		ries=sc.next().charAt(0);
		ries=Character.toUpperCase(ries);
		
		//Validar que el riesgo sea un caracter válido y forzarlo a mayúscula
		while(ries!='X' & ries!='M' & ries!='B') {
			System.out.println("Por favor, introduce un caracter válido: X, M o B");
			ries=sc.next().charAt(0);
			ries=Character.toUpperCase(ries);
		}
		
		//Comprobar el riesgo del préstamo para seleccionar el interés
		if(ries=='X')
			interes=21;
		else if(ries=='M')
			interes=12;
		else
			interes=10;
		
		//Mostrar el resultado de la operación
		System.out.println("El préstamo debe ser pagado en " +cuotas+ " cuotas de " +(pres/cuotas+(pres*interes/100)/cuotas));
		
		//Volver a pedir el importe del préstamo para repetir el programa
		System.out.println("Introduce el importe del préstamo");
		pres=sc.nextInt();
		
		//Validar que el préstamo sea positivo
		while(pres<0) {
			System.out.println("Has introducido un valor negativo, por favor, introduce un préstamo válido");
			pres=sc.nextInt();
		}
		}

	}

}
