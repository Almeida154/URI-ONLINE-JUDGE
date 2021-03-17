package Beginner;

// Vector Padding I

import java.util.Scanner;
public class Uri1173 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int vetor[] = new int[10];
		int x;
		x = in.nextInt();
		for(int j=0, i=x; j<10; i*=2, j++) {
			vetor[j]=i;
		}
		for(int i=0; i<10; i++) {
			System.out.println("N["+i+"] = "+vetor[i]);
		}
	}
}