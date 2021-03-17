package Beginner;

// Ho Ho Ho!

import java.util.*;
public class Uri1759 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int qnt = in.nextInt();

		for(int i = 0; i < qnt; i++) {
			if(qnt < 2) System.out.println("Ho!");
			else if(i == 0 && qnt != 1) System.out.print("Ho");
			else if(i == qnt - 1 && qnt != 1) System.out.println(" Ho!");
			else System.out.print(" Ho");
		}

	}

}