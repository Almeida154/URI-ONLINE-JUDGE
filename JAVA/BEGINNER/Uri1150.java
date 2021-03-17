package Beginner;

// Overtaking Z

import java.util.Scanner;
public class Uri1150 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int x, z, k=0, s=0, aux=0;
		x=ler.nextInt();
		while(k==0) {
			z=ler.nextInt();
			if(z>x) {
				k++;
				for(int i=0; s<z; i++) {
					s+=x+i;
					aux++;
				}
				System.out.println(aux);
			}
			else {
				k+=0;
			}
		}
	}
}