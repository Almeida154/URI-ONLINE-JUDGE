package Beginner;

// Bazinga!

import java.util.Scanner;
public class Uri1828 {
	public static void main(String[]args) {	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			String sheldonOpc = in.next();
			String rajOpc = in.next();
			
			if(sheldonOpc.equals(rajOpc)) System.out.println("Caso #" + i + ": " + "De novo!");
			else{
				switch(sheldonOpc) {
					case "tesoura": shot(rajOpc, "papel", "lagarto", i); break;	
					case "papel": shot(rajOpc, "pedra", "Spock", i); break;
					case "pedra": shot(rajOpc, "lagarto", "tesoura", i); break;
					case "lagarto": shot(rajOpc, "Spock", "papel", i); break;
					case "Spock": shot(rajOpc, "tesoura", "pedra", i); break;
				}
			}
		}
	}
	
	public static void shot(String raj, String move01, String move02, int pos) {
		if(raj.equals(move01) || raj.equals(move02)) 
			System.out.println("Caso #" + pos + ": " + "Bazinga!");
		else System.out.println("Caso #" + pos + ": " + "Raj trapaceou!");
	}	
}