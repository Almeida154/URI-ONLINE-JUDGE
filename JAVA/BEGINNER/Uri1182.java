package Beginner;

// Column in Matrix

import java.util.Scanner;
public class Uri1182 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int colunax; 
		double m[][] = new double[12][12];
		String letra;
		colunax = in.nextInt();
		letra = in.next();
		for(int L=0; L<12; L++) {
			for(int C=0; C<12; C++) {
				m[L][C] = in.nextDouble();
			}
		}
		double soma=0;
		for(int L=0; L<12; L++) {
			soma+=m[L][colunax];
		}
		if(letra.equals("S")) System.out.printf("%.1f\n", soma);
		if(letra.equals("M")) System.out.printf("%.1f\n", soma/12);
	}
}