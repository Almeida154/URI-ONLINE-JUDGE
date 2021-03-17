package Beginner;

// Prefácio

import java.util.Scanner;
public class Uri1837 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int q, r;
        if(a >= 0) {
        	q = a / b;
        	r = a % b;	
        }else{
        	int x = b, y = 0;
        	if(b < 0) x = b * -1;
        	
        	for(r = 0; r < x; r++) {
        		y = a - r;
        		if(y % b == 0) break;
        	}
        	q = y / b;
        }
        System.out.println(q + " " + r);
	}
}