package Beginner;

// Game Time

import java.util.Scanner;
public class Uri1046 {
	public static void main(String[] args) {
		int strtTm, endTm, durationTm;
		Scanner ler=new Scanner(System.in);
		strtTm=ler.nextInt();
		endTm=ler.nextInt();
	    durationTm=endTm-strtTm;
	    if (durationTm<0) {
	        durationTm=24+(endTm-strtTm);
	    }
	
	    if (strtTm==endTm) {
	    	System.out.println("O JOGO DUROU 24 HORA(S)");
	    }
	
	    else {
	    	System.out.println("O JOGO DUROU " +durationTm+ " HORA(S)");
	    } 
	}
}