import java.util.HashMap;

public class ReplacetheSubstringforBalancedString {
    public int balancedString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('Q', 0);
        map.put('W', 0);
        map.put('E', 0);
        map.put('R', 0);
        for ( int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        int target = s.length()/4;
        int minLength = s.length();
        int left = 0;
        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right), map.get(s.charAt(right))-1);
            while((left<s.length()) &&
            map.get('Q')<= target &&
            map.get('W')<= target &&
            map.get('E')<= target &&
            map.get('R')<= target) {
                minLength = Math.min(minLength, right-left+1);
                map.put(s.charAt(left), map.get(s.charAt(left))+1);
                left++;
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        String s = "QQWE";
        ReplacetheSubstringforBalancedString output = new ReplacetheSubstringforBalancedString();
        int result = output.balancedString(s);
        System.out.println(result);
    }
}
