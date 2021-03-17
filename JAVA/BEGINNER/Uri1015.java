package Beginner;

// Distance Between Two Points

import java.util.Scanner;
public class Uri1015 {
	public static void main (String[] args) {
		double x1, y1, x2, y2, d, r;
		Scanner ler= new Scanner (System.in);
		x1=ler.nextDouble();
		y1=ler.nextDouble();
		x2=ler.nextDouble();
		y2=ler.nextDouble();
		d=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		r=Math.sqrt(d);
		System.out.printf("%.4f\n",r);
	}
}