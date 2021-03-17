package Beginner;

// Pairs Between Five Numbers

import java.util.Scanner;
public class Uri1065 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double x, m=0, t=0;
		int i=0, aux=0;
		while (i<5) {
			x=ler.nextDouble();
			if (x%2==0) {
				aux++;
			}
			i++;
		}
		System.out.println(aux+" valores pares");
	}
}