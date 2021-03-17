package Beginner;

// Bob Conduit

import java.util.Scanner;
public class Uri1589 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = 0; i < n; i++) {
			int r1 = in.nextInt();
			int r2 = in.nextInt();
			System.out.println(r1 + r2);
		}
	}
}