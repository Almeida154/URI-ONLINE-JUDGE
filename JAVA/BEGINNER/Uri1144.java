package Beginner;

// Logical Sequence

import java.util.Scanner;
public class Uri1144 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i=1, n, x=0;
		n=ler.nextInt();
		while (i<=n) {
			for (int s=i, q=(s*i), c=(q*s); s==i; s++) {
				System.out.println(s+" "+q+" "+c);
				System.out.println(s+" "+(q+1)+" "+(c+1));
			}
		i++;
		}
	}
}