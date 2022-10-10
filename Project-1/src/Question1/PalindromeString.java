package Question1;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String str){

        int i=0, j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String, which you want to check :");
        String str = obj.next();

        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
}
