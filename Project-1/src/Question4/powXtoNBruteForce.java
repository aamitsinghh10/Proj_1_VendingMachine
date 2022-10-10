package Question4;

import java.util.Scanner;

public class powXtoNBruteForce {
    public static double PowXtoNBruteForce(int x, int n){

        if(x==0)
            return 0;
        if(n==0)
            return 1;
        return x*PowXtoNBruteForce(x, n-1);
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of X:");
        int x = obj.nextInt();

        System.out.println("Enter value of N:");
        int n = obj.nextInt();

        System.out.println("Output: "+PowXtoNBruteForce(x,n));
    }
}
