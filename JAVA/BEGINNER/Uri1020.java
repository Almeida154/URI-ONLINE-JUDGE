package Beginner;

// Age in Days

import java.util.Scanner;
public class Uri1020 {
	public static void main (String[] args) {
		int d, aux;
		Scanner ler= new Scanner (System.in);
		d=ler.nextInt();
		System.out.println(d/365+" ano(s)");
		aux=d%365;
		System.out.println(aux/30+" mes(es)");
		aux=aux%30;
		System.out.println(aux/1+" dia(s)");
	}
}