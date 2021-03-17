package Beginner;

// Six Odd Numbers

import java.util.Scanner;
public class Uri1070 {
    public static void main(String args[]) {
        int i, x, add=12, aux;
    	Scanner ler=new Scanner(System.in);
    	x=ler.nextInt();
    	for(i=x; i<(x+add); i=i+2) {
    		if(i%2==0) {
    			aux=i+1;
    			System.out.println(aux);
    		}
    		else {
    			aux=i;
    			System.out.println(aux);
    		}
    	}
    }
}