package Beginner;

// Ages

import java.util.Scanner;
public class Uri1154 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int id, i=1, k=0, idt=0, it=0;
		float m;
		while(k==0) {
			id=ler.nextInt();
			if(id>0) {
				idt+=id;
				it+=i;
			}
			else {
				k++;
				m=(float)((float)idt/it);
				System.out.printf("%.2f\n",m);
			}
		}
	}
}