package Beginner;

// Fibonacci in Vector

import java.util.Scanner;
public class Uri1176 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		long fib[] = new long[61];
		fib[0]=0;
		fib[1]=1;
		for(int i=2; i<61; i++) {
			fib[i]=fib[i-2]+fib[i-1];
		}
		int n, x, i=1;
		x = in.nextInt();
		while(i<=x) {
			n = in.nextInt();
			System.out.println("Fib("+n+") = "+fib[n]);
			i++;
		}
	}
}