package Beginner;

// Dividing X by Y

import java.util.Scanner;
public class Uri1116 {
	public static void main (String[] agrs) {
		Scanner ler=new Scanner(System.in);
		double a, b, i, n, t;
		n=ler.nextInt();
		for (i=1; i<=n; i++) {
			a=ler.nextDouble();
			b=ler.nextDouble();
			if (b==0) {
				System.out.println("divisao impossivel");
			}
			else {
				t=a/b;
				System.out.printf("%.1f\n",t);
			}
		}
	}
}