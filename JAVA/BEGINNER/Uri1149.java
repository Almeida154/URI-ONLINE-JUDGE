package Beginner;

// Adding Consecutive Integers

import java.util.Scanner;
public class Uri1149 {
	public static void main(String[] args) {
		int k=0, a, n, t=0;
		Scanner ler=new Scanner(System.in);
		a=ler.nextInt();
        while(k==0) {
        	n=ler.nextInt();
        	if(n>0) {
        		k++;
		        for (int i=1; i<=n; i++) {
		            t+=a;
		            a++;
		        }
        	}
        	else {
        		k+=0;
        	}
        }
        System.out.println(t);
    }
}