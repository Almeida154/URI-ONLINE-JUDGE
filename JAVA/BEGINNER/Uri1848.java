package Beginner;

// Counter Crow

import java.util.Scanner;
public class Uri1848 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		int i = 0;
		int sum = 0;
		
		while(i < 3) {
			String crowAction = in.nextLine();
			if(crowAction.equals("caw caw")){
				System.out.println(sum);
				i++;
				sum = 0;
			}else {
				sum += blink(crowAction);
			}
		}
	}
	
	public static int blink(String s) {
		if(s.equals("--*")) return 1;
		else if(s.equals("-*-")) return 2;
		else if(s.equals("-**")) return 3;
		else if(s.equals("*--")) return 4;
		else if(s.equals("*-*")) return 5;
		else if(s.equals("**-")) return 6;
		else if(s.equals("***")) return 7;
		else return 8;
	}
}