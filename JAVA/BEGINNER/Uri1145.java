package Beginner;

// Logical Sequence 2

import java.util.Scanner;
public class Uri1145 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int x, y, i;
        x=ler.nextInt();
        y=ler.nextInt();
        if (x>1 && x<20 && y>x && y<100000) {
            for (i=1 ; i<=y; i++) {
                System.out.print(i);
                if(i%x==0){
                    System.out.println("");
                }else{
                    System.out.print(" ");
                }
            }
            if(y%x!=0){
                System.out.println("");
            }
            
        }
    }
}