package Beginner;

// Sequence S

import java.util.Scanner;
public class Uri1155 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double s=0, x;
		for(x=1; x<=100; x++) {
			s=s+(1/x);
		}
		System.out.printf("%.2f\n", s);
	}
}