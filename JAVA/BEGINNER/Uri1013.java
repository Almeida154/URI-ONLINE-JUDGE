package Beginner;

// The Biggest

import java.util.Scanner;
public class Uri1013 {
	public static void main (String[] args) {
		int a, b, c;
		Scanner ler= new Scanner (System.in);
		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
		if (a>b && a>c) {
			System.out.println(a+" eh o maior");
		}
		else if (b>a && b>c) {
			System.out.println(b+" eh o maior");
		}
		else if (c>a && c>b) {
			System.out.println(c+" eh o maior");
		}
	}

}