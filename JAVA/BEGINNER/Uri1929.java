package Beginner;

// Triangle

import java.util.Scanner;
public class Uri1929 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] sticks = new int[] {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
		String answer = verifyTriangle(sticks) ? "S" : "N";
		System.out.println(answer);
		
	}
	
	private static boolean verifyTriangle(int sticks[]) {
		if(sticks[0] + sticks[1] > sticks[2] && sticks[0] + sticks[2] > sticks[1] && sticks[1] + sticks[2] > sticks[0]
		|| sticks[1] + sticks[2] > sticks[3] && sticks[1] + sticks[3] > sticks[2] && sticks[2] + sticks[3] > sticks[1]
		|| sticks[2] + sticks[3] > sticks[0] && sticks[2] + sticks[0] > sticks[3] && sticks[3] + sticks[0] > sticks[2]
		|| sticks[3] + sticks[0] > sticks[1] && sticks[3] + sticks[1] > sticks[0] && sticks[0] + sticks[1] > sticks[3])
			return true;
		else return false;
	}
}