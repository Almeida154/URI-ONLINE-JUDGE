package Beginner;

// Welcome to winter!

import java.util.Scanner;
public class Uri1847 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int temp1 = in.nextInt();
		int temp2 = in.nextInt();
		int temp3 = in.nextInt();
		
		if(temp2 < temp1 && temp3 >= temp2) System.out.println(":)");
        else if(temp2 > temp1 && temp3 <= temp2) System.out.println(":(");
        else if(temp2 > temp1 && temp3 > temp2 && (temp3 - temp2) < (temp2 - temp1)) System.out.println(":(");
        else if(temp2 > temp1 && temp3 > temp2 && (temp3 - temp2) >= (temp2 - temp1)) System.out.println(":)");
        else if(temp2 < temp1 && temp3 < temp2 && (temp2 - temp3) < (temp1 - temp2)) System.out.println(":)");
        else if(temp2 < temp1 && temp3 < temp2 && (temp2 - temp3) >= (temp1 - temp2)) System.out.println(":(");
        else if(temp2 == temp1 && temp3 > temp2) System.out.println(":)");
        else if(temp2 == temp1 && temp3 < temp2) System.out.println(":(");
        else System.out.println(":(");
	}
}