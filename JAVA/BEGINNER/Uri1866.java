package Beginner;

// Count

import java.util.Scanner;
public class Uri1866 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			x = x % 2 == 0 ? 0 : 1;
			System.out.println(x);
		}
	}
}