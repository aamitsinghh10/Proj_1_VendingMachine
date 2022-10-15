package Question4;

import java.util.Scanner;

public class powXtoNBruteForce {
    public static double PowXtoNBruteForce(double x, int n){

        if(x==0)
            return 0;
        if(n==0)
            return 1;
        
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return x*PowXtoNBruteForce(x, n-1);
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of X:");
        double x = obj.nextDouble();

        System.out.println("Enter value of N:");
        int n = obj.nextInt();

        System.out.println("Output: "+PowXtoNBruteForce(x,n));
    }
}
