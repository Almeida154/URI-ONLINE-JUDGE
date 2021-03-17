package Beginner;

// Vector Padding II

import java.util.Scanner;
public class Uri1177 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int x, n[] = new int[1000];
		x = in.nextInt();
		for(int i=0, j=0; i<1000; i++, j++) {
			if(j==x) {
				j=0;
			}
			n[i]=j;
			System.out.println("N["+i+"] = "+n[i]);
		}
	}
}