package pack4;

public class Ejercicio7_1 {

	public static void main(String[] args) {
		int p, i, v;
		p=2;
		i=1;
		
		System.out.println("Pares del uno al 100 :");
		for(v=1;v<=100;v+=2) {
			System.out.print(p+" ; ");
			p+=2;
		}
		System.out.println();
		System.out.println("Impares del uno al 100 :");
		for(v=1;v<=100;v+=2) {
			System.out.print(i+" ; ");
			i+=2;
		}

	}

}
