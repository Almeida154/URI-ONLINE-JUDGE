package Beginner;

// Even or odd

import java.util.Scanner;
public class Uri1074 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, i, x;
		n=ler.nextInt();
		for (i=0; i<n; i++) {
			x=ler.nextInt();
			if (x==0) {
				System.out.println("NULL");
			}
			else if (x%2==0 && x>0) {
				System.out.println("EVEN POSITIVE");
			}
			else if (x%2==0 && x<0) {
				System.out.println("EVEN NEGATIVE");
			}
			else if (x%2!=0 && x>0) {
				System.out.println("ODD POSITIVE");
			}
			else if (x%2!=0 && x<0) {
				System.out.println("ODD NEGATIVE");
			}
		}
 	}
}