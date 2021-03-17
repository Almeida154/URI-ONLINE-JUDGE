package Beginner;

// Square Matrix IV

import java.util.*;
public class Uri1827 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {	
			int op = in.nextInt();
			int matrix[][] = new int[op][op];
			
			int aux = op - 1;
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					if(j == i) matrix[i][j] = 2;
					if(j == aux) matrix[i][j] = 3;
					if(j != i && j != aux) matrix[i][j] = 0;
				}
				aux--;
			}
			
			
			for(int i = op / 3; i < op - (matrix.length / 3); i++) {
				for(int j = op / 3; j < op - (matrix.length / 3); j++) {
					matrix[i][j] = 1;
					if(i == (matrix.length / 2)
							&& j == (matrix.length / 2)) {
						matrix[i][j] = 4;
					}
				}
			}
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}