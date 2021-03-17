package Beginner;

// Vector Padding III

import java.util.Scanner;
public class Uri1178 {
	public static void main(String[]args) {
		Scanner andressinha = new Scanner (System.in);;
		double x, n[] = new double[100];
		x = andressinha.nextDouble();
		n[0]=x;
		System.out.printf("N[0] = %.4f%n", n[0]);
		for(int i=1; i<100; i++) {
			n[i]=n[i-1]/2;
			System.out.print("N["+i+"] = ");
			System.out.printf("%.4f%n", n[i]);
		}
	}
}