package Beginner;

// Interval 2

import java.util.Scanner;
public class Uri1072 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, x, i=0, in=0, out=0;
		n=ler.nextInt();
		while (i<n) {
			x=ler.nextInt();
			if (x>=10 && x<=20) {
				in++;
			}
			if(x<10 || x>20) {
				out++;
			}
			i++;
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
	}
}