package Beginner;

// Circle Area

import java.util.Scanner;
public class Uri1002 {
	public static void main(String[] args){
	    double r,a;
	    Scanner ler = new Scanner(System.in);
	    r=ler.nextDouble();
	    a=3.14159*r*r;
	    System.out.printf("A=%.4f\n", +a);
	}
}