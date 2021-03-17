package Beginner;

// Note Validation

import java.util.Scanner;
public class Uri1117 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double x, m=0, t=0;
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
	}
}