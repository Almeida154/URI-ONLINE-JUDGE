package Beginner;

// Average 3

import java.util.Scanner;
public class Uri1040 {
	public static void main (String[] args) {
		double n1, n2, n3, n4, m, ne;
		Scanner ler= new Scanner (System.in);
		n1=ler.nextDouble();
		n2=ler.nextDouble();
		n3=ler.nextDouble();
		n4=ler.nextDouble();
		m=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		System.out.printf("Media: %.1f\n ",m);
		if (m>=7) {
			System.out.println("Aluno aprovado.");
		}
		else if (m<5) {
			System.out.println("Aluno reprovado.");
		}
		else if (m>=5) {
			System.out.println("Aluno em exame.");
			ne=ler.nextDouble();
			m=(m+ne)/2;
			System.out.println("Nota do exame: "+ne);
			if (m>=5) {
				System.out.println("Aluno aprovado.");
			}
			else{
				System.out.println("Aluno reprovado.");
			}	
			System.out.printf("Media final: %.1f\n ",m);
		}
	}
}