package Beginner;

// The Slug Race

import java.util.*;
public class Uri1789 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int n = in.nextInt();
			int major = 0;
			for(int i = 0; i < n; i++) {
				int currentSlug = in.nextInt();
				major = currentSlug > major ? currentSlug : major;
			}
			int res = 0;
			if(major < 10) res = 1;
			else if(major < 20) res = 2;
			else res = 3;
			System.out.println(res);
		}

	}

}