public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        String input = s+s;
        return input.substring(1,input.length()-1).contains(s);
    }
    public static void main(String[] args) {
        String s = "abab";
        RepeatedSubstring output = new RepeatedSubstring();
        boolean result = output.repeatedSubstringPattern(s);
        System.out.println(result);
    }
}
