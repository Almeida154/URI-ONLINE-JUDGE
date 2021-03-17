package Beginner;

// Consumption

import java.util.Scanner;
public class Uri1014 {
	public static void main (String[] args) {
		int x;
		double y, c;
		Scanner ler= new Scanner (System.in);
		x=ler.nextInt();
		y=ler.nextDouble();
		c=x/y;
		System.out.printf("%.3f km/l\n",c);
	}

}