package Beginner;

// Average 2

import java.util.Scanner;
public class Uri1006 {
	public static void main (String[] args) {
		double a, b, c, m;
		Scanner ler= new Scanner (System.in);
		a=ler.nextDouble();
		b=ler.nextDouble();
		c=ler.nextDouble();
		m=((a*2)+(b*3)+(c*5))/(2+5+3);
		System.out.printf("MEDIA = %,.1f\n", +m);
	}

}