package Beginner;

// Weighted Averages

import java.util.Scanner;
public class Uri1079 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double n, x1, x2, x3, m, i=0;
		n=ler.nextDouble();
		while (i<n) {
			x1=ler.nextDouble();
			x2=ler.nextDouble();
			x3=ler.nextDouble();
			m=((x1*2)+(x2*3)+(x3*5))/10;
			System.out.printf("%.1f\n",m);
			i++;
		}
	}
}