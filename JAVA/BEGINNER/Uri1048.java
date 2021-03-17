package Beginner;

// Salary Increase

import java.util.Scanner;
public class Uri1048 {
	public static void main (String[] args) {
		Scanner ler= new Scanner (System.in);
		double s, ns, p, r;
		s=ler.nextDouble();
		if (s<=400.00) {
			r=s*15/100;
			ns=s+r;
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",r);
			System.out.println("Em percentual: 15 %");
		}
		
		if (s>400.00 && s<=800.00) {
			r=s*12/100;
			ns=s+r;
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",r);
			System.out.println("Em percentual: 12 %");
		}
		
		if (s>800.00 && s<=1200.00) {
			r=s*10/100;
			ns=s+r;
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",r);
			System.out.println("Em percentual: 10 %");
		}
		
		if (s>1200.00 && s<=2000.00) {
			r=s*7/100;
			ns=s+r;
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",r);
			System.out.println("Em percentual: 7 %");
		}
		
		if (s>2000.00) {
			r=s*4/100;
			ns=s+r;
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",r);
			System.out.println("Em percentual: 4 %");
		}
	}
}