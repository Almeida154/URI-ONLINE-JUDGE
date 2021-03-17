package Beginner;

// Salary

import java.util.Scanner;
public class Uri1008 {
	public static void main (String[] args) {
		double s;
		int nf, ht;
		Scanner ler= new Scanner (System.in);
		nf=ler.nextInt();
		ht=ler.nextInt();
		s=ler.nextDouble();
		System.out.printf("NUMBER = %d\n", nf);
		System.out.printf("SALARY = U$ %.2f\n", ht*s);
	}

}