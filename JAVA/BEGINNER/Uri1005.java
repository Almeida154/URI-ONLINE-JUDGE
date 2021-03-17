package Beginner;

// Average 1

import java.util.Scanner;
public class Uri1005 {
    public static void main(String[] args){
        double a, b, m;
        Scanner ler = new Scanner(System.in);
        a=ler.nextDouble();
        b=ler.nextDouble();
        m=(((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));
        System.out.printf("MEDIA = %,.5f\n", m);
    }
}