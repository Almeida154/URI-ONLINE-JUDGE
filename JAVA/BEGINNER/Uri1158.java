package Beginner;

// Sum of Consecutive Odd III

import java.util.Scanner;
public class Uri1158 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int i=1, x, y, t, n, aux, soma;
		n=ler.nextInt();
		while(i<=n) {
			soma=0;
			x=ler.nextInt();
			y=ler.nextInt();
			for(aux=x, t=0; t<y; aux++) {
				if(aux%2!=0) {
					soma=soma+aux;
					t++;
				}
			}
			System.out.println(soma);
			i++;
		}
	}
}