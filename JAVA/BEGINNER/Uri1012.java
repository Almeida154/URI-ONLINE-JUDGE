package Beginner;

// Area

import java.util.Scanner;
public class Uri1012 {
	public static void main (String[] args) {
		double pi=3.14159, a, b, c, tri, cir, tra, qua, ret;
		Scanner ler= new Scanner (System.in);
		a=ler.nextDouble();
		b=ler.nextDouble();
		c=ler.nextDouble();
		tri=(a*c)/2;
		cir=(c*c)*pi;
		tra=((a+b)/2)*c;
		qua=b*b;
		ret=a*b;
		System.out.printf("TRIANGULO: %.3f\n",tri);
		System.out.printf("CIRCULO: %.3f\n",cir);
		System.out.printf("TRAPEZIO: %.3f\n",tra);
		System.out.printf("QUADRADO: %.3f\n",qua);
		System.out.printf("RETANGULO: %.3f\n",ret);
	}

}