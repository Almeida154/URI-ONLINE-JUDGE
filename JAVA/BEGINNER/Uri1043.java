package Beginner;

// Triangle

import java.util.Scanner;
public class Uri1043 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double a, b, c, pTri, aTra;
		a=ler.nextDouble();
		b=ler.nextDouble();
		c=ler.nextDouble();
		if (a<(b+c) && b<(a+c) && c<(b+a)) {
			pTri=a+b+c;
			System.out.printf("Perimetro = %.1f\n",pTri);
		}
		else {
			aTra=((a+b)/2)*c;
			System.out.printf("Area = %.1f\n",aTra);
		}
	}
}