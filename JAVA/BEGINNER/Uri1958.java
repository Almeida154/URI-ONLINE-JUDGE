package Beginner;
import java.util.Scanner;

// Scientific Notation

public class Uri1958 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		System.out.println(String.format((String.valueOf(x).startsWith("-") ? "" : "+") + "%.4E", x));
		
	}

}
