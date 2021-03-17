package Beginner;

// Positives and Average

import java.util.Scanner;
public class Uri1064 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double x, m=0, t=0;
		int i=0, aux=0;
		while (i<6) {
			x=ler.nextDouble();
			if (x>0) {
				aux++;
				t+=x;
			}
			i++;
		}
		m=t/aux;
		System.out.println(aux+" valores positivos");
		System.out.printf("%.1f\n",m);
	}
}