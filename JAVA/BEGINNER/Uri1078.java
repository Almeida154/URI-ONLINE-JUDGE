package Beginner;

// Multiplication Table

import java.util.Scanner;
public class Uri1078 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, r, i=1;
		n=ler.nextInt();
		while (i<=10) {
			r=i*n;
			System.out.println(i+" x "+n+" = "+r);
			i++;
		}
	}
}