package Leet1;

import java.util.Scanner;

public class PalindromeNumbers {
    public static boolean isPalindrome(int userInput) {
        if(userInput<0){
            return false;
        }
        int sum=0;
        int i=userInput;
        while(i!=0){
            int remainder=i%10;
            sum=sum*10+remainder;
            i=i/10;
        }
        return sum==userInput;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner((System.in));
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.close();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
    }

}
