package Beginner;

// Convert to hexadecimal

import java.util.Scanner;
public class Uri1957 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dec = in.nextInt();
		String hex = Integer.toHexString(dec);
		System.out.println(hex.toUpperCase());
		
	}
	
}