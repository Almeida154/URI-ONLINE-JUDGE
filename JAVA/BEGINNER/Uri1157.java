package Beginner;

// Dividers I

import java.util.Scanner;
public class Uri1157 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int x;
		x=ler.nextInt();
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				System.out.println(i);
			}
		}
	}
}