package Beginner;

// Square Matrix I

import java.util.*;
public class Uri1435 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			int op = in.nextInt();
			if(op == 0) break;
			
			int matrix[][] = new int[op][op];
			int aux = 1;
			
			for(int i = 1; i <= op; i++) {
				for(int j = 1; j <= op; j++) {
					aux = i;
					if(aux > j) aux = j;
					if(aux > op - i + 1) aux = op - i + 1;
					if(aux > op - j + 1) aux = op - j + 1;
					matrix[i - 1][j - 1] = aux;
				}
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