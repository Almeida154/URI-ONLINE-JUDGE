package Beginner;

// Ascending and Descending

import java.util.Scanner;
public class Uri1113 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int a, b, k=0;
		while(k==0) {
			a=ler.nextInt();
			b=ler.nextInt();
			if(a<b && a!=b) {
				System.out.println("Crescente");
			}
			if(a>b && a!=b) {
				System.out.println("Decrescente");
			}
			if(a==b) {
				k=k+1;
			}
		}
	}
}