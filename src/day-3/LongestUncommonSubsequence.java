public class LongestUncommonSubsequence {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(),b.length());
    }
    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        LongestUncommonSubsequence output = new LongestUncommonSubsequence();
        int result = output.findLUSlength(a, b);
        System.out.println(result);
    }
}
