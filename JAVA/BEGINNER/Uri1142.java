package Beginner;

// PUM

import java.util.Scanner;
public class Uri1142 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i=0, n, s, x=0;
		n=ler.nextInt();
		while (i!=n) {
			for (s=1; s!=4; s++) {
				x=x+1;
				System.out.print(x+" ");
				if (s==3) {
					x=x+1;
					System.out.println("PUM");
				}
			}
			i++;
		}
	}
}