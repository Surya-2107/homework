import java.util.HashMap;
import java.util.Scanner;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for ( int i=0; i<s.length(); i++){
            char pre = s.charAt(i);
            if(map.containsKey(pre)){
                a= Math.max(a,map.get(pre)+1);
            }
            map.put(pre,i);
            b=Math.max(b, i-a+1);
        }
        return b;
    }
        public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("Length of Longest SubString is: " + lengthOfLongestSubstring(s));
}
}
