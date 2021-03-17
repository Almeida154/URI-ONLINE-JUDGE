package Beginner;

// Fibonacci Easy

import java.util.Scanner;
public class Uri1151 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, i=2, n3, n1=0, n2=1;
		n=ler.nextInt();
		System.out.print(n1+" "+n2);
		while(i<n && n<46) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
		 System.out.print("\n");
	}
}