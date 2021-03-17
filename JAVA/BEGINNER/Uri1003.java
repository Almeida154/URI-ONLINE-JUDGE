package Beginner;

// Simple Sum

import java.util.Scanner;
public class Uri1003 {
	public static void main (String[] args) {
		int a, b, soma;
		Scanner ler= new Scanner (System.in);
		a=ler.nextInt();
		b=ler.nextInt();
		soma=a+b;
		System.out.println("SOMA = "+soma);
	}
}