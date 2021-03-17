package Beginner;

// Game Time With Minutes

import java.util.Scanner;
public class Uri1047 {
	public static void main(String[] args) {
		int start_h, end_h, start_m, end_m, duration_h, duration_m;
		Scanner ler= new Scanner(System.in);
		start_h=ler.nextInt();
		start_m=ler.nextInt();
		end_h=ler.nextInt();
		end_m=ler.nextInt();
		duration_h=end_h-start_h;
		if (duration_h<0) {
			duration_h=24+(end_h-start_h);
		}
		duration_m=end_m-start_m;
		if (duration_m<0) {
			duration_m=60+(end_m-start_m);
			duration_h--;
		}
		if (start_h==end_h && start_m==end_m) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else 
			System.out.println("O JOGO DUROU " +duration_h+ " HORA(S) E "+duration_m+" MINUTO(S)");
	}
}