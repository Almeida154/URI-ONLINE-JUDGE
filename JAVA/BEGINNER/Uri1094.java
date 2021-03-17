package Beginner;

// Experiences

import java.util.Scanner;
public class Uri1094 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int i, n, x, t=0, c=0, r=0, s=0;
		double pC=0, pR=0, pS=0;
		String a;
		n=ler.nextInt();
		for (i=1; i<=n; i++) {
			x=ler.nextInt();
			a=ler.next();
			t=t+x;
			if (a.equals("C")) {
				c=c+x;
			}
			else if(a.equals("R")) {
				r=r+x;
			}
			else if(a.equals("S")) {
				s=s+x;
			}
			pC=(c*100.00)/t;
			pR=(r*100.00)/t;
			pS=(s*100.00)/t;
		}
		System.out.println("Total: "+t+" cobaias");
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		System.out.printf("Percentual de coelhos: %.2f", pC);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", pR);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f", pS);
		System.out.println(" %");

	}
}