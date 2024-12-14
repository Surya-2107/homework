package Leet1;

import java.util.Scanner;

public class lengthOfLastWord {
    public static int wordLength(String name) {
            int count = 0;
            for (int i=name.length()-1; i>=0; i--){
                if (name.charAt(i)!= ' ') {
                    count++;
                }else if (count>0){
                    break;
                }
            }
            return count;
        }
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = scanner.nextLine();
        scanner.close();
        System.out.println("Last Word Length is: " + wordLength(userInput));
}
}
