package Beginner;

// Tri-du

import java.util.Scanner;
public class Uri1933 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] cards = new int[] {in.nextInt(), in.nextInt()};
		
		if(cards[0] == cards[1]) System.out.println(cards[0]);
		else {
			int ma = cards[0] > cards[1] ? cards[0] : cards[1];
			System.out.println(ma);
		}
		
	}
	
}