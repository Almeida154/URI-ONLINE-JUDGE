package Beginner;

// Perfect Number

import java.util.Scanner;
public class Uri1164 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int n, x, c=0;
		n=ler.nextInt();
		while(c<n) {
			int soma=0;
			x=ler.nextInt();
			for(int i=1; i<x; i++) {
				if(x%i==0) {
					soma=soma+i;
				}
			}
			if(soma==x) {
			System.out.println(x+" eh perfeito");
			}
			else {
				System.out.println(x+" nao eh perfeito");
			}
			c++;
		}
	}
}