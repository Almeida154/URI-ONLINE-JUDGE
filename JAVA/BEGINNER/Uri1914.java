package Beginner;

// Whose time is it?

import java.util.Scanner;
public class Uri1914 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			String[] p1 = new String[2];
			String[] p2 = new String[2];
			int[] moves = new int[2];
			
			p1[0] = in.next(); p1[1] = in.next();
			p2[0] = in.next(); p2[1] = in.next();
			moves[0] = in.nextInt();
			moves[1] = in.nextInt();
			
			String whoChoseEven, whoChoseOdd;
			
			if(p1[1].equals("PAR")) { whoChoseEven = p1[0]; whoChoseOdd = p2[0]; }
			else { whoChoseEven = p2[0]; whoChoseOdd = p1[0]; }
			
			String winner = (moves[0] + moves[1]) % 2 == 0 ? whoChoseEven : whoChoseOdd;		
			
			System.out.println(winner);
		}
	}
}