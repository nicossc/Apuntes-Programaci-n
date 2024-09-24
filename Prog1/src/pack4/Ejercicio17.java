package pack4;

public class Ejercicio17 {

	public static void main(String[] args) {
		int n=1, v=1;
		while(v<=9) {
		while(n<=v) {
			System.out.print(n);
			n+=1;
		}
		v+=1;
		n=1;
		System.out.println();
		}
	}

}
