package Beginner;
import java.util.Scanner;

// Roman Numbering for Page Numbers

public class Uri1960 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] dec = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		String[] roman = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		
		int num = in.nextInt();
		String romanNum = "";
		
		for(int i = dec.length - 1; i >= 0; i--) {
			
			while(true) {
				if(num >= dec[i]) {
					num -= dec[i];
					romanNum += roman[i];
				} else break;
			}
			
		}
		
		System.out.println(romanNum);
				
	}

}