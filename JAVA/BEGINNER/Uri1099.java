package Beginner;

// Sum of Consecutive Odd II

import java.util.Scanner;
public class Uri1099 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int x=0, y=0, t, n;
		n=ler.nextInt();	
		for (int i=0; i<n; i++) {
			t=0;
			x=ler.nextInt();
			y=ler.nextInt();
			if(x%2!=0 && x>y) x--;
			if(y%2!=0 && y>x) y--;
			if(x%2!=0 && x<y) x++;
			if(y%2!=0 && y<x) y++;
				for(;x<y;x++){
					if(x%2!=0)
					t=t+x;
				}
				for(;x>y;y++){
					if(y%2!=0)
					t=t+y;
				}
			System.out.println(t);
		}
	}
}