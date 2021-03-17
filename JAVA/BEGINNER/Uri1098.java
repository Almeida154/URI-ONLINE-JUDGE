package Beginner;

//Sequence IJ 4

import java.util.Scanner;
public class Uri1098 {
	public static void main (String[] args) {
		double i, j, aux;
		for (i=0, j=1, aux=0; i<2.1f; aux++, j++) {
			if (aux==3) {
				i=i+0.2f;
				j=1+i;
				aux=0;
			}
			if (i<2.1f) {
				if (i==1 || (i>2 && i<2.1) || i==0) {
					System.out.printf("I=%.0f J=%.0f\n", i, j);
				}
				else {
					System.out.printf("I=%.1f J=%.1f\n", i, j);
				}
			}
		}
	}
}