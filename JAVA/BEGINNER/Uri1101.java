package Beginner;

// Sequence of Numbers and Sum

import java.util.Scanner;
public class Uri1101 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, y, k=0;
		while (k!=1) {
			x=ler.nextInt();
			y=ler.nextInt();
			int soma=0;
			if (x<=0 || y<=0) {
				k=k+1;
			}
			else if (x>y) {
				for (y=y; y<=x; y++) {
					soma+=y;
					System.out.print(y+" ");
				}
				System.out.println("Sum="+soma);
			}
			else if (y>x) {
				for (x=x; x<=y; x++) {
					soma+=x;
					System.out.print(x+ " ");
				}
				System.out.println("Sum="+soma);
			}
		}
	}
}