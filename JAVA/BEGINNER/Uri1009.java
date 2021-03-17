package Beginner;

// Salary With Bonus

import java.util.Scanner;
public class Uri1009 {
	public static void main (String[] args) {
		double sf, tv, c, st;
		String nome;
		Scanner ler= new Scanner (System.in);
		nome=ler.next();
		sf=ler.nextDouble();
		tv=ler.nextDouble();
		c=(tv*15)/100;
		st=c+sf;
		System.out.printf("TOTAL = R$ %.2f\n", st);
	}

}