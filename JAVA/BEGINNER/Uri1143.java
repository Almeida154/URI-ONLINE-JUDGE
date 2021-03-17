package Beginner;

// Square and Cube

import java.util.Scanner;
public class Uri1143 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i=1, n, x=0;
		n=ler.nextInt();
		while (i<=n) {
			for (int s=i, q=(s*i), c=(q*s); s==i; s++) {
				System.out.println(s+" "+q+" "+c);
			}
			i++;
		}
	}
}