package Beginner;

// Multiples of 13

import java.util.Scanner;
public class Uri1132 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i=0, x, y, aux=0;
		x=ler.nextInt();
		y=ler.nextInt();
		if (x>y) {
            for (i=y; i<=x; i++) {
                if (i%13!=0) {
                    aux=aux+i;
                }
            }
            System.out.println(aux);
        }
		else if (x<y) {
            for (i=x; i<=y; i++) {
                if (i%13!=0) {
                    aux=aux+i;
                }
            }
            System.out.println(aux);
        }
	}
}