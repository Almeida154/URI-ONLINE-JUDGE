package Beginner;

// Selection Test 1

import java.util.Scanner;
public class Uri1035 {
	public static void main (String[] args) {
		Scanner ler= new Scanner (System.in);
		int a, b, c, d, cd, ab, par;
		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
		d=ler.nextInt();
		cd=c+d;
		ab=a+b;
		par=a%2;
		if (b>c && d>a && cd>ab && c>0 && d>0 && par==0) {
			System.out.println ("Valores aceitos");
		}
		else {
			System.out.println ("Valores nao aceitos");
		}
	}
}