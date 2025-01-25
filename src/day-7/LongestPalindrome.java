import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int length=0;
        HashSet <Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            char character = s.charAt(i);
            if(set.contains(character)){
                length= length+2;
                set.remove(character);
            }else {
                set.add(character);
            }
        }
        if(set.size()>0){
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        String s="abccccdd";
        LongestPalindrome output = new LongestPalindrome();
        int result=output.longestPalindrome(s);
        System.out.println(result);
    }
}
