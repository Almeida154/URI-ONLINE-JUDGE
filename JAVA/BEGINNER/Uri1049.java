package Beginner;

// Animal

import java.util.Scanner;
public class Uri1049 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		String c1, c2, c3;
		c1=ler.next();
		c2=ler.next();
		c3=ler.next();
		//--------------------------------------------------------//
		if (c1.equals("vertebrado") && c2.equals("ave") && c3.equals("carnivoro")) {
			System.out.println("aguia");
		}
		
		if (c1.equals("vertebrado") && c2.equals("ave") && c3.equals("onivoro")) {
			System.out.println("pomba");
		}
		
		if (c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("onivoro")) {
			System.out.println("homem");
		}
		
		if (c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("herbivoro")) {
			System.out.println("vaca");
		}
		//--------------------------------------------------------//
		if (c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("hematofago")) {
			System.out.println("pulga");
		}
		
		if (c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		
		if (c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		
		if (c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("onivoro")) {
			System.out.println("minhoca");
		}
		//--------------------------------------------------------//
	}
}