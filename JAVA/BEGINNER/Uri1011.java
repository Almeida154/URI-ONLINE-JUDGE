package Beginner;

// Sphere

import java.util.Scanner;
public class Uri1011 {
	public static void main (String[] args) {
		double v, pi=3.14159, r;
		Scanner ler= new Scanner (System.in);
		r=ler.nextDouble();
		v=(4.0/3)*pi*(r*r*r);
		System.out.printf("VOLUME = %.3f\n",v);
	}
}