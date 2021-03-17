package Beginner;

// Ascending Strings

import java.util.Scanner;
public class Uri1146 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, k=1, i;
		while(k!=0) {
			n=ler.nextInt();
			if (n!=0) {
				k-=0;
			}
			else if (n==0) {
				k-=1;
			}
			for (i=1; i<=n; i++) {
				if (i<n) {
					System.out.print(i+" ");
					}
					else {
						System.out.println(i);
					}
			}
		}
	}
}