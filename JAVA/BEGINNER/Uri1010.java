package Beginner;

// Simple Calculation

import java.util.Scanner;
public class Uri1010 {
	public static void main (String[] args) {
		int cod1, cod2, num1, num2;
		double vu1, vu2, vt;
		Scanner ler= new Scanner (System.in);
		cod1=ler.nextInt();
		num1=ler.nextInt();
		vu1=ler.nextDouble();
		vu1=vu1*num1;
		cod2=ler.nextInt();
		num2=ler.nextInt();
		vu2=ler.nextDouble();
		vu2=vu2*num2;
		vt=vu2+vu1;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", vt);
	}

}