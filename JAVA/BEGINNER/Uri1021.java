package Beginner;

// Banknote and Coins

import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri1021 {
	public static void main (String[] args) {
		Scanner ler= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0, m, n, m50=0, m25=0, m10=0, m5=0, m1=0;
        n=ler.nextDouble();
        m=n*100;
        n100=n/100;
        n%=100;
        n50=n/50;
        n%=50;
        n20=n/20;
        n%=20;
        n10=n/10;
        n%=10;
        n5=n/5;
        n%=5;
        n2=n/2;
        n%=2;
        n1=n/1;
        n%=1;
        m=m%100;
        m50=m/50;
        m%=50;
        m25=m/25;
        m%= 25;
        m10=m/10;
        m%=10;
        m5=m/5;
        m%=5;
        m1=m;
        System.out.println("NOTAS:");
        System.out.println((int)n100 + " nota(s) de R$ 100.00");
        System.out.println((int)n50 + " nota(s) de R$ 50.00");
        System.out.println((int)n20 + " nota(s) de R$ 20.00");
        System.out.println((int)n10 + " nota(s) de R$ 10.00");
        System.out.println((int)n5 + " nota(s) de R$ 5.00");
        System.out.println((int)n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)n1 + " moeda(s) de R$ 1.00");
        System.out.println((int)m50 + " moeda(s) de R$ 0.50");
        System.out.println((int)m25 + " moeda(s) de R$ 0.25");
        System.out.println((int)m10 + " moeda(s) de R$ 0.10");
        System.out.println((int)m5 + " moeda(s) de R$ 0.05");
        System.out.println((int)m1 + " moeda(s) de R$ 0.01");

    }
}