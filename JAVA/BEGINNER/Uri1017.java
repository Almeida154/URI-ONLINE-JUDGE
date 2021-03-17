package Beginner;

// Fuel Spent

import java.util.Scanner;
public class Uri1017 {
	public static void main (String[] args) {
		double l, r, vmkm, tg, dp;
		Scanner ler= new Scanner (System.in);
		tg=ler.nextDouble();
		vmkm=ler.nextDouble();
		dp=tg*vmkm;
		r=dp/12;
		System.out.printf("%.3f\n",r);
	}

}