package Beginner;
import java.util.Scanner;

// A long time ago

public class Uri1962 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		for(int i = 0; i < n; i++){
			long year = in.nextInt();
			long resultado = year - 2015;

			if(resultado > 0) System.out.println(resultado + 1 + " A.C.");
			else if(resultado < 0) System.out.println(-resultado + " D.C.");
			else System.out.println("1 A.C.");
		}
		
		/*for(int i = 0; i < n; i++) {
			String res;
			long year = in.nextInt();
			if(year >= 2015) res = year - 2014 + " A.C";
			else res = 2015 - year + " D.C";
			System.out.println(res);
		}*/
				
	}

}