package Beginner;

// Simple Factorial

import java.util.Scanner;
public class Uri1153 { 
	public static void main (String args[]){ 
		int n, i=1, f=1; 
		Scanner ler= new Scanner (System.in);
		n=ler.nextInt();
		while (i<=n) {
			f=f*i;
			i++;
		}
		System.out.println(f);
	}
}