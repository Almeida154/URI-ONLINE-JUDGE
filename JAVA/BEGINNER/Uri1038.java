package Beginner;

// Lunch

import java.util.Scanner;
public class Uri1038 {
	public static void main (String[] args) {
		Scanner ler= new Scanner (System.in);
		double t, c, c1=4.00, c2=4.50, c3=5.00, c4=2.00, c5=1.50, x;
		c=ler.nextDouble();
		x=ler.nextDouble();
		if (c==1) {
			System.out.printf("Total: R$ %.2f\n",c1*x);
		}
		else if (c==2) {
			System.out.printf("Total: R$ %.2f\n",c2*x);
		}
		else if (c==3) {
			System.out.printf("Total: R$ %.2f\n",c3*x);
		}
		else if (c==4) {
			System.out.printf("Total: R$ %.2f\n",c4*x);
		}
		else if (c==5) {
			System.out.printf("Total: R$ %.2f\n",c5*x);
		}
	}
}