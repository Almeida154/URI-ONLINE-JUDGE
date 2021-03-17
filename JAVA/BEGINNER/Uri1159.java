package Beginner;

// Sum of Consecutive Pairs

import java.util.Scanner;
public class Uri1159 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int k=0, x, t, aux, soma;
		while(k==0) {
			soma=0;
			x=ler.nextInt();
			if(x!=0) {
				for(aux=x, t=0; t<5; aux++) {
					if(aux%2==0) {
						soma=soma+aux;
						t++;
					}
				}
				System.out.println(soma);
			}
			else {
				k+=1;
			}
		}
	}
}