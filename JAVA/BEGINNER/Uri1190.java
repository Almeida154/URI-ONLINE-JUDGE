package Beginner;

// Right Area

import java.util.*;

public class Uri1190 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		String op = in.next();
		double matrix[][] = new double[12][12];
		double sum = 0;
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				matrix[i][j] = in.nextDouble();
			}
		}
		
		for(int j = 7; j < 12; j++) {
			for(int i = 12 - j; i < j; i++) {
				sum += matrix[i][j];
			}
		}
		
		switch(op) {
			case "S":
				System.out.printf("%.1f\n", sum);
				break;
			case "M":
				System.out.printf("%.1f\n", sum / ((144 - 24) / 4));
				break;
		}
		
	}

}