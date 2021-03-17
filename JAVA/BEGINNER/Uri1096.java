package Beginner;

// Sequence IJ 2

import java.util.Scanner;
public class Uri1096 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i, j, c;
		for (i=1; i<=9; i+=2) {
			for (i=i, j=7; j>=5; j-=1) {
				System.out.println("I="+i+" J="+j);
			}
		}
	}
}