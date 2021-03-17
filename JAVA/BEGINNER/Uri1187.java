package Beginner;

// Upper Area

import java.util.Scanner;
public class Uri1187 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m[][] = new double[12][12], sum = 0;
        int count = 0;
        String res = in.next();
        for(int L = 0; L < m.length; L++) {
            for(int C = 0; C < m.length; C++) {
                m[L][C] = in.nextDouble();
                
                if(C > L && C < (m.length - L - 1)) {
                    sum += m[L][C];
                    count++;
                }
            }
        }
        if(res.equals("S")) System.out.printf("%.1f\n", sum);
        else System.out.printf("%.1f\n", (sum / count));
    }
}