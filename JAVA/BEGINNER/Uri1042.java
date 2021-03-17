package Beginner;

// Simple Sort

import java.util.Scanner;
public class Uri1042 {
	public static void main (String[] args) {
		Scanner ler= new Scanner (System.in);
		int n1, n2, n3;
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}
		else if (n1>n2 && n1>n3 && n3>n2) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}
		else if (n2>n1 && n2>n3 && n3>n1) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
		else if (n2>n1 && n2>n3 && n1>n3) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}
		else if (n3>n1 && n3>n2 && n1>n2) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}
		else if (n3>n1 && n3>n2 && n2>n1) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}
		System.out.println("");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}

// TA ERRADO ESSA DESGRAÇA