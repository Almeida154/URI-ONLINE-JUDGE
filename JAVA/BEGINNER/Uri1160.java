package Beginner;

// Population Growth

import java.util.Scanner;
public class Uri1160 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int t, pa, pb, i=1;
		double g1, g2;
		t=ler.nextInt();
		while(i<=t) {
			pa=ler.nextInt();
			pb=ler.nextInt();
			g1=ler.nextDouble();
			g2=ler.nextDouble();
			int a=0;
			while(pa<=pb) {
				pa+=pa*(g1/100.0);
				pb+=pb*(g2/100.0);
				a++;
				if(a>100) {
					System.out.println("Mais de 1 seculo.");
					pa=pb+1;
				}
			}
			if(a<=100) {
				System.out.println(a+" anos.");
			}
			i++;
		}
	}
}