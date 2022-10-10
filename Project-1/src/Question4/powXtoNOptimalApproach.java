package Question4;

import java.util.Scanner;

public class powXtoNOptimalApproach {
    public static double PowXtoN(int x, int n){

        if(x==0)
            return 0;
        if(n==0)
            return 1;
        double temp = PowXtoN(x,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else {
            return x*temp*temp;
        }
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of X:");
        int x = obj.nextInt();

        System.out.println("Enter value of N:");
        int n = obj.nextInt();

        System.out.println("Output: "+PowXtoN(x,n));
    }
}