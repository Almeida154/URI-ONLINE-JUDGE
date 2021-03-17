package Beginner;

// Exchange in Vector I

import java.util.Scanner;
public class Uri1175 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int n[] = new int[20];
		int n2[] = new int[20];
		for(int i=0; i<20; i++) {
			n[i] = in.nextInt();
		}
		for(int i=19, j=0; i>=0 && j<20; i--, j++) {
			n2[j]=n[i];
		}
		for(int i=0; i<20; i++) {
			System.out.println("N["+i+"] = "+n2[i]);
		}
	}
}