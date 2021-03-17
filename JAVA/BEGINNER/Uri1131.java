package Beginner;

import java.util.Scanner;
public class Uri1131 {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		int k=0, g=0, i=0, r, gi, gg, e=0, c=0, somagi=0, somagg=0;
		while (k==0) {
			gi=ler.nextInt();
			somagi=somagi+gi;
			gg=ler.nextInt();
			somagg=somagg+gg;
			if (gi>gg) {
				i=i+1;
			}
			if (gg>gi) {
				g=g+1;
			}
			if (gi==gg) {
				e=e+1;
			}
			c=c+1;
			System.out.println("Novo grenal (1-sim 2-nao)");
			r=ler.nextInt();
			if (r==1) {
				k=k+0;
			}
			else if (r==2) {
				System.out.println(c+" grenais");
				System.out.println("Inter:"+i);
				System.out.println("Gremio:"+g);
				System.out.println("Empates:"+e);
				System.out.println("Gols do gremio:"+somagg);
				System.out.println("Gols do gremio:"+somagi);
				if (i>g) {
					System.out.println("Inter venceu mais");
				}
				else if (g>i) {
					System.out.println("Gremio venceu mais");
				}
				else if (g==i) {
					System.out.println("Nao houve vencedor");
				}
				k=k+1;
			}
		}
	}
}