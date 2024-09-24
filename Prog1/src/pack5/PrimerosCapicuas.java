package pack5;

public class PrimerosCapicuas {

	public static void main(String[] args) {
		int n=100, aux, inv=0, dig;
		for(n=100;n<=10000;n++) {
			aux=n;
			while(aux!=0) {
				dig=aux%10;
				inv=inv*10+dig;
				aux=aux/10;
			}
			if(inv==n) {
				System.out.println(n);
			}
			inv=0;
		}

	}

}
