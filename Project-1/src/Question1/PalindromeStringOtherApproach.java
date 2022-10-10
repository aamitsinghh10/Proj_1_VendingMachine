package Question1;

import java.util.Scanner;

public class PalindromeStringOtherApproach {
    public static boolean isPalindrome(String str){

        String s = "";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        if(s.equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String, which you want to check :");
        String str = obj.next();

        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
}
