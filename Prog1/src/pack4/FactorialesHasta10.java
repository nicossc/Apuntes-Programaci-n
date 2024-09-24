package pack4;

public class FactorialesHasta10 {

	public static void main(String[] args) {
		int n=1, v;
		for(n=1;n<=10;n++) {
		v=n-1;
		System.out.print(n+"! = "+n+" ");
		int i=n;
		while(v>0) {
			System.out.print("x ");
			System.out.print(v+" ");
			i*=v;
			v-=1;
		}
		System.out.println("= " +i);
		}

	}

}
