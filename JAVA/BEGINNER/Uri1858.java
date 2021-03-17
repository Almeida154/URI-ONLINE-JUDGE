package Beginner;
import java.util.Scanner;

// The answer of Theon

public class Uri1858 {
	
	public static void main(String[]args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int j = in.nextInt();
			int vet[] = new int[j]; vet[0] = in.nextInt();
			int mePos = 0;
			int me = vet[0];
			for(int i = 1; i < j; i++) {
				vet[i] = in.nextInt();
				if(vet[i] < me) {
					me = vet[i];
					mePos = i;
				}
			}
			System.out.println(mePos + 1);			
		}
	}
}