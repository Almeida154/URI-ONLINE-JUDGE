package Beginner;

// Major and Position

import java.util.Scanner;
public class Uri1080 {
    public static void main(String[] args) {
        int x, ma=0, p=0, i=1;
        Scanner ler=new Scanner(System.in);
        while (i<=100) {
            x=ler.nextInt();
            if (ma>x) {
                ma=ma;
                p=p;
            }
            else {
                ma=x;
                p=i;
            }
            i++;
        }
        System.out.println(ma);
        System.out.println(p);
    }
}