package Beginner;

// Lower Area

import java.util.Scanner;
public class Uri1188 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		String opc = ler.next();
		double m[][] = new double [12][12], count = 0;
		
		for(int l=0; l<12; l++) {
			for(int c=0; c<12; c++){
				m[l][c] = ler.nextDouble();
			}
		}
		int aux = 5;
		for(int l=7; l<12; l++) {
			for(int c=aux--; c<l; c++) {
				count+=m[l][c];
			}
		}
		
		if(opc.equals("S")) System.out.printf("%.1f\n",count);
		else if(opc.equals("M")) System.out.printf("%.1f\n",count/30);
	}
}