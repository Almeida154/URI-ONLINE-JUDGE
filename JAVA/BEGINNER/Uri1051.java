package Beginner;

// Income Tax

import java.util.Scanner;
public class Uri1051 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		double s, i=0, aux;
		s=ler.nextDouble();
		if (s>4500) {
			i=(1000*8/100)+(1500*18/100);
			aux=s-4500;
			i=i+(aux*28/100);
		}
		
		else if (s>3000) {
			i=1000*8/100;
			aux=s-3000;
			i=i+(aux*18/100);
		}
		
		else if (s>2000) {
			aux=s-2000;
			i=i+(aux*8/100);
		}
		
		//---------------------------------//
		if (i>0) {
			System.out.printf("R$ %.2f\n",i);
		}
		else {
			System.out.println("Isento");
		}
		//---------------------------------//
	}
}