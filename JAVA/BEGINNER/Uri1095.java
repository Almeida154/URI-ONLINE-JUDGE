package Beginner;

// Sequence IJ 1

import java.util.Scanner;
public class Uri1095 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		int i, j;
		for (i=1, j=60; j>=0; i+=3, j-=5) {
			System.out.println("I="+i+" J="+j);
		}
	}
}