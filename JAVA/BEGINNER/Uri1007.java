package Beginner;

// Difference

import java.util.Scanner;
public class Uri1007 {
	public static void main (String[] args) {
		int a, b, c, d, dif;
		Scanner ler= new Scanner (System.in);
		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
		d=ler.nextInt();
		dif=(a*b)-(c*d);
		System.out.println("DIFERENCA = "+dif);
	}

}