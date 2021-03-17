package Beginner;

// Matrix 123

import java.util.*;
public class Uri1534 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {	
	
			int op = in.nextInt();
			int matrix[][] = new int[op][op];
			int aux = op - 1;
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					if(j == i) matrix[i][j] = 1;
					if(j == aux) matrix[i][j] = 2;
					if(j != i && j != aux) matrix[i][j] = 3;
				}
				aux--;
			}
			
			for(int i = 0; i < op; i++) {
				for(int j = 0; j < op; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println("");
			}
			
		}
	}
}