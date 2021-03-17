package Beginner;

// Prime Number

import java.util.Scanner;
public class Uri1165 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int n, i=0, x;
		n=ler.nextInt();
		while(i<n) {
			int primo=0;
			x=ler.nextInt();
			for(int c=1; c<=x; c++) {
				if(x%c==0) {
					primo++;
				}
			}
			if(primo<3) {
				System.out.println(x+" eh primo");
			}
			else {
				System.out.println(x+" nao eh primo");
			}
			i++;
		}
	}
}