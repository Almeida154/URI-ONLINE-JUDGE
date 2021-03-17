package Beginner;

// Building Houses

import java.util.*;
public class Uri1541 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for(;true;) {
			
			int n1 = in.nextInt();
			if(n1 == 0) break;
			int n2 = in.nextInt();
			int percent = in.nextInt();
		
			int houseSize = n1 * n2;
			int ground = (houseSize * 100) / percent;

			System.out.println((int)Math.sqrt(ground));
			
		}
	}
}
