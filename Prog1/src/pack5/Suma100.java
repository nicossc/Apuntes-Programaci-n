package pack5;

public class Suma100 {

	public static void main(String[] args) {
		int s=100;
		System.out.print(s);
		for(int i=s-2;i>=0;i-=2) {
			System.out.print(" + "+i);
			s+=i;
		}
		
		System.out.print(" = "+s);

	}

}
