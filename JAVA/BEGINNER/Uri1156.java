package Beginner;

// Sequence S II

import java.util.Scanner;
public class Uri1156 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double s=0, x, y;
		for(x=1, y=1; y<=39; x*=2, y+=2) {
			s=s+(y/x);
		}
		System.out.printf("%.2f\n", s);
	}
}