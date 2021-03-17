package Beginner;

// Rest 2

import java.util.Scanner;
public class Uri1075 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, i=0;
		n=ler.nextInt();
		while (i<=10000) {
			if (i%n==2) {
				System.out.println(i);
			}
			i++;
		}
	}
}