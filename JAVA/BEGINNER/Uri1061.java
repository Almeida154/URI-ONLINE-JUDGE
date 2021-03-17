package Beginner;

// Time of an Event

import java.util.Scanner;
public class Uri1061 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int di, hi, mi, si;
		int df, hf, mf, sf;
		int d, h, m, s;
		int soma, sh, sm;
		String dia, dp;
		//------------//
		dia=ler.next();
		di=ler.nextInt();
		hi=ler.nextInt();
		dp=ler.next();
		mi=ler.nextInt();
		dp=ler.next();
		si=ler.nextInt();
		//------------//
		dia=ler.next();
		df=ler.nextInt();
		hf=ler.nextInt();
		dp=ler.next();
		mf=ler.nextInt();
		dp=ler.next();
		sf=ler.nextInt();
		//------------//
		di=di*86400;
		df=df*86400;
		d=df-di;
		//-------//
		hi=hi*3600;
		hf=hf*3600;
		h=hf-hi;
		//-------//
		mi=mi*60;
		mf=mf*60;
		m=mf-mi;
		//-------//
		si=si*1;
		sf=sf*1;
		s=sf-si;
		//-------//
		soma=d+h+m+s;
		d=soma/86400;
		System.out.println(d+" dia(s)");
		h=soma%86400;
		sh=h%3600;
		h=h/3600;
		System.out.println(h+" hora(s)");
		sm=sh%60;
		m=sh/60;
		System.out.println(m+" minuto(s)");
		System.out.println(sm+" segundo(s)");
	}
}