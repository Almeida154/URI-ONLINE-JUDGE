package Beginner;

// Quadrant

import java.util.Scanner;
public class Uri1115 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, y, k=0;
		while (k==0) {
			x=ler.nextInt();
			y=ler.nextInt();
			if (x==0 || y==0) {
				k+=1;
			}
			if (x>0 && y>0) {
				System.out.println("primeiro");
			}
			if (x<0 && y>0) {
				System.out.println("segundo");
			}
			if (x<0 && y<0) {
				System.out.println("terceiro");
			}
			if (x>0 && y<0) {
				System.out.println("quarto");
			}
		}
	}
}