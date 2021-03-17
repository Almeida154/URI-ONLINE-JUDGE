package Beginner;

// Types of Triangles

import java.util.Scanner;
public class Uri1045 {
	  public static void main(String[] args) {
	  Scanner ler=new Scanner(System.in);
	  double a, b, c;
	  a=ler.nextDouble();
	  b=ler.nextDouble();
	  c=ler.nextDouble();
	  double tempA=Math.max(a, Math.max(b, c));
	  double tempB=0;
	  double tempC=0;
	  
	  if (tempA==a) {
	   tempB=Math.max(b, c);
	   tempC=Math.min(b, c);
	  }
	  if (tempA==b) {
	   tempB=Math.max(a, c);
	   tempC=Math.min(a, c);
	  }
	  if (tempA==c) {
	   tempB=Math.max(b, a);
	   tempC=Math.min(b, a);
	  }
	  
	  if (tempA>=tempB+tempC) {
		  System.out.println("NAO FORMA TRIANGULO");
	  }
	  
	  if (tempA*tempA==(tempB*tempB)+(tempC*tempC)) {
		  System.out.println("TRIANGULO RETANGULO");
	  }
	  
	  else if (tempA*tempA>(tempB*tempB)+(tempC*tempC)) {
		  System.out.println("TRIANGULO OBTUSANGULO");
	  }
	  
	  if (tempA*tempA<(tempB*tempB)+(tempC*tempC)) {
		  System.out.println("TRIANGULO ACUTANGULO");
	  }
	  
	  if (tempA==tempB && tempB==tempC) {
		  System.out.println("TRIANGULO EQUILATERO");
	  }
	  
	  if (((tempA==tempB) && (tempA!=tempC)) || ((tempA==tempC) && (tempA!=tempB)) || ((tempB==tempC) && (tempB!=tempA))) {
		  System.out.println("TRIANGULO ISOSCELES");
	  }
	  }
}