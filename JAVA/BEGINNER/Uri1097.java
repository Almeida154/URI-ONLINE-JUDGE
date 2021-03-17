package Beginner;

//Sequence IJ 3

import java.util.Scanner;
public class Uri1097 {
	public static void main (String[] args) {
		Scanner ler=new Scanner(System.in);
		int i, j, aux;
        for (i=1, j=7; i<=9; i+=2, j+=2) {
            for (i=i, aux=j; aux>=(j-2); aux-=1) {
                System.out.println("I="+i+" J="+aux);
            }
        }
    }
}