package Beginner;

// Vector Padding IV

import java.util.Scanner;
public class Uri1179{
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int par[] = new int[5];
		int impar[] = new int[5];
		int n;
		for(int imparesc=0, paresc=0, i=0; i<15; i++) {
			n = in.nextInt();
			if(n%2!=0) {
				impar[imparesc++] = n;
			}else {
				par[paresc++] = n;
			}
			if(paresc==5) {
				for(int j=0; j<5; j++) {
					System.out.println("par["+j+"] = "+par[j]);
				}
				paresc = 0;
				par = new int[5];
			}
			if(imparesc==5) {
				for(int j=0; j<5; j++) {
					System.out.println("impar["+j+"] = "+impar[j]);
				}
				imparesc = 0;
				impar = new int[5];
			}
		}
		for(int i=0; i<impar.length; i++) {
			if(impar[i]!=0) System.out.println("impar["+i+"] = "+impar[i]);
		}
		for(int i=0; i<par.length; i++) {
			if(par[i]!=0) System.out.println("par["+i+"] = "+par[i]);
		}
	}
}