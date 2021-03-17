package Beginner;

// Sum of Consecutive Odd I

import java.util.Scanner;
public class Uri1071 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int x, y, t=0, i=0;
		x=ler.nextInt();
		y=ler.nextInt();
		if (x>y) {
			for (i=x-1; i>y; i--) {
				if (i%2!=0) {
					t=t+i;
				}
			}
		}
		else {
			for (i=y-1; i>x; i--) {
				if (i%2!=0) {
					t=t+i;
				}
			}
		}
		System.out.println(t);
	}
}