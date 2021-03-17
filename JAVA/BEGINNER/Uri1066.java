package Beginner;

// Even, Odd, Positive and Negative

import java.util.Scanner;
public class Uri1066 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double x, m=0, t=0;
		int i=0, par=0, impar=0, neg=0, pos=0;
		while (i<5) {
			x=ler.nextDouble();
			if (x%2==0) {
				par++;
			}
			if (x%2!=0) {
				impar++;
			}
			if (x>0) {
				pos++;
			}
			if (x<0) {
				neg++;
			}
			i++;
		}
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(pos+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");
	}
}