public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int dp[][] = new int[s.length()][s.length()];
        int i=0;
        int j=0;
        for(i=s.length()-1;i>=0;i--){
            dp[i][i] =1;
            for(j=i+1;j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
    public static void main(String[] args) {
        String s = "bbbab";
        LongestPalindromicSubsequence output = new LongestPalindromicSubsequence();
        int result = output.longestPalindromeSubseq(s);
        System.out.println(result);
    }
}
