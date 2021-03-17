package Beginner;

// Type of Fuel

import java.util.Scanner;
public class Uri1134 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, r, g=0, d=0, a=0, k=0;
		while (k==0) {
			n=ler.nextInt();
			if (n==4) {
				k+=1;
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: "+a);
				System.out.println("Gasolina: "+g);
				System.out.println("Diesel: "+d);
			}
			else if (n==1) {
				a+=1;
			}
			else if (n==2) {
				g+=1;
			}
			else if (n==3) {
				d+=1;
			}
			else {
				k+=0;
			}
		}
	}
}