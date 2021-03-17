package Beginner;

// Positive Numbers

import java.util.Scanner;
public class Uri1060 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		double x;
		int i=0, aux=0;
		while (i<6) {
			x=ler.nextDouble();
			if (x>0) {
				aux++;
			}
			i++;
		}
		System.out.println(aux+" valores positivos");
	}
}