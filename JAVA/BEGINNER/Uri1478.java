package Beginner;

// Square Matrix II

import java.util.*;
public class Uri1478 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {	
			
			int op = in.nextInt();
			if(op == 0) break;
			int matrix[][] = new int[op][op];
			int aux = 2;
			
			for(int i = 0; i < op; i++) {
				int dBigger = 1;
				int dSmaller = aux;
				for(int j = 0; j < op; j++) {
					if(j > i) matrix[i][j] = ++dBigger;
					if(j < i) matrix[i][j] = --dSmaller;
					if(j == i) matrix[i][j] = 1;
				}
				aux++;
			}
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					if(j == 0) System.out.printf("%3d", matrix[i][j]);
					else System.out.printf(" %3d", matrix[i][j]);
				}
				System.out.println("");
			}
			System.out.println("");
			
		}
	}
}