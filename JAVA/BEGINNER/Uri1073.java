package Beginner;

// Pairs Square

import java.util.Scanner;
public class Uri1073 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, r, i=0;
		n=ler.nextInt();
		while (i<=n) {
			if (i%2==0 && i!=0) {
				r=i*i;
				System.out.println(i+"^2 = "+r);
			}
			i++;
		}
	}
}