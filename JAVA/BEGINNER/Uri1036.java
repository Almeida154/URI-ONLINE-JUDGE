package Beginner;

// Bhaskara Formula

import java.util.Scanner;
public class Uri1036 {
	public static void main (String [] args) {
		double raiz, a, b, c, delta, bha2, bha3;;
		Scanner ler= new Scanner (System.in);
		a=ler.nextDouble();
		b=ler.nextDouble();
		c=ler.nextDouble();
		delta=(b*b)-(4*a*c);
		if (a==0 || delta<0) {
			System.out.println("Impossivel calcular");
		}
		else if (delta>0) {
			bha2=(-b+Math.sqrt(delta))/(2*a);
			bha3=(-b-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f\n", bha2);
			System.out.printf("R2 = %.5f\n", bha3);
		}
	}
}