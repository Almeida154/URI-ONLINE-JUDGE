package Beginner;

// Simple Product

import java.util.Scanner;
public class Uri1004 {
	public static void main (String[] args) {
		int a, b, prod;
		Scanner ler= new Scanner (System.in);
		a=ler.nextInt();
		b=ler.nextInt();
		prod=a*b;
		System.out.println("PROD = "+prod);
	}
}