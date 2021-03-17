package Beginner;

// Odd Numbers

import java.util.Scanner;
public class Uri1067 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, i;
		x=ler.nextInt();
		for (i=1; i<=x; i=i+2) {
			System.out.println(i);
		}
	}
}