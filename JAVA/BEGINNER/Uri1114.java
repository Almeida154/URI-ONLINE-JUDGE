package Beginner;

// Fixed Password

import java.util.Scanner;
public class Uri1114 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, k=0, i=0;
		while (k==0) {
			x=ler.nextInt();
			if(x==2002) {
				k=k+1;
				System.out.println("Acesso Permitido");
			}
			else {
				System.out.println("Senha Invalida");
			}
		}
	}
}