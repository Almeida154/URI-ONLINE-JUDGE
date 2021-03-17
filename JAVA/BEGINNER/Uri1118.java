package Beginner;

// Multiple Validated Notes

import java.util.Scanner;
public class Uri1118 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double x, m=0, t=0, c=0;
		while (c!=1) {
			m=0;
			t=0;
			for (int k=0; k!=2;) {
				x=ler.nextDouble();
				if (x<=10 && x>=0) {
					t=t+x;
					k=k+1;
				}
				else {
					System.out.println("nota invalida");
				}
			}
			m=t/2;
			System.out.printf("media = %.2f\n", m);
			int l=0;
			while (l!=1) {
				System.out.println("novo calculo (1-sim 2-nao)");	
				int q=ler.nextInt();
				if (q!=1 || q!=2) {
					l=l+0;
				}
				if (q==1) {
					l=l+1;
					c=c+0;
				}
				if (q==2) {
					l=l+1;
					c=c+1;
				}
			}
		}
	}
}