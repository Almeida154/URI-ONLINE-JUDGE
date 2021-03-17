package Beginner;

// Square Matrix III

import java.util.*;
public class Uri1557 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {	
			
			int op = in.nextInt();
			if(op == 0) break;
			int matrix[][] = new int[op][op];
			int doub = 1;
			int biggerNumber = 1;
			int distance = 0;
			
			for(int i = 0; i < op; i++) {
				int aux = doub;
				for(int j = 0; j < op; j++) {
					matrix[i][j] = aux;
					aux *= 2;
					if(matrix[i][j] > biggerNumber) biggerNumber = matrix[i][j];
				}
				doub *= 2;
			}
			
			do {
				biggerNumber /= 10;
				distance++;
			}while(biggerNumber > 0);
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					
					if(j == 0) System.out.printf("%"+ distance +"d", matrix[i][j]);
					else System.out.printf(" %"+ distance +"d", matrix[i][j]);
					
				}
				System.out.println("");
			}
			System.out.println("");
			
		}
	}
}