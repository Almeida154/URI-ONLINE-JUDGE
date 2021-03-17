package Beginner;
import java.util.Scanner;

// Jumping frog

public class Uri1961 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		int jumpSize = in.nextInt(), qntPipes = in.nextInt();
		int pipesSize[] = new int[qntPipes];
		boolean frogCanJump = true;
		
		for(int i = 0; i < qntPipes; i++) pipesSize[i] = in.nextInt();
			
		for(int i = 0; i < qntPipes; i++) {
			try {
				if(pipesSize[i] < pipesSize[i + 1]) {
					frogCanJump = pipesSize[i + 1] - pipesSize[i] <= jumpSize ? true : false;
					if(!frogCanJump) break;
				} else {
					frogCanJump = pipesSize[i] - pipesSize[i + 1] <= jumpSize ? true : false;
					if(!frogCanJump) break;
				}
			} catch(Exception e) {
				// sei de nada fi
			}
		}
		
		if(frogCanJump) System.out.println("YOU WIN");
		else System.out.println("GAME OVER");
				
	}

}