package Beginner;

// Time Conversion

import java.util.Scanner;
public class Uri1019 {
	public static void main (String[] args) {
		int t, aux, h, m, s;
		Scanner ler= new Scanner (System.in);
		t=ler.nextInt();
		h=t/3600;
		aux=t%3600;
		m=aux/60;
		aux=t%60;
		s=aux/1;
		System.out.println(h+":"+m+":"+s);
	}
}