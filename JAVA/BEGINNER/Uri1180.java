package Beginner;

// Minor and Position

import java.util.Scanner;
public class Uri1180 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int x, n, menor, posicao=0;
		x = in.nextInt();
		int vet[]= new int[x];
		for(int i=0; i<x; i++) {
			n = in.nextInt();
			vet[i] = n;
		}
		menor = vet[0];
		for(int i=0; i<x; i++) {
			if(vet[i]<menor) {
				menor = vet[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posicao);
	}
}