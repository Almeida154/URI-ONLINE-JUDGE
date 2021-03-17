package Beginner;

// Above the Secondary Diagonal

import java.util.Scanner;
public class Uri1185 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double m[][] = new double[12][12];
		String letra;
		letra = in.next();
		for(int L=0; L<12; L++) {
			for(int C=0; C<12; C++) {
				m[L][C] = in.nextDouble();
			}
		}
		double soma=0;
		for(int L=0; L<11; L++) {
			for(int C=0; C<11-L; C++) {
				soma+=m[L][C];
			}
		}
		if(letra.equals("S")) System.out.printf("%.1f\n", soma);
		if(letra.equals("M")) System.out.printf("%.1f\n", soma/66);
	}
}