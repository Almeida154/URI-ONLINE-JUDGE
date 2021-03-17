package Beginner;

// Selection in Vector I

import java.util.Scanner;
public class Uri1174 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double vetor[] = new double[100];
		for(int i=0; i<100; i++) {
			vetor[i]=in.nextDouble();
		}
		for(int i=0; i<100; i++) {
			if(vetor[i]<=10) {
				System.out.println("A["+i+"] = "+vetor[i]);
			}
		}
	}
}