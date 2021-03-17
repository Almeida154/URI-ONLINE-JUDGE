package Beginner;

// Coordinates of a Point

import java.util.Scanner;
public class Uri1041 {
	public static void main (String[] args) {
		Scanner ler= new Scanner (System.in);
		double x, y;
		x=ler.nextDouble();
		y=ler.nextDouble();
		if (x==0 && y==0) {
			System.out.println("Origem");
		}
		else if (x>0 && y>0) {
			System.out.println("Q1");
		}
		else if (x<0 && y>0) {
			System.out.println("Q2");
		}
		else if (x<0 && y<0) {
			System.out.println("Q3");
		}
		else if (x>0 && y<0) {
			System.out.println("Q4");
		}
		else if (x==0) {
			System.out.println("Eixo Y");
		}
		else if (y==0) {
			System.out.println("Eixo X");
		}
	}
}