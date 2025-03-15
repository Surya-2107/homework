public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int pdg = 0; 
            for (int j = 1; j <= n; j++) {
                int temp = dp[j]; 
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[j] = pdg + 1; 
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]); 
                }
                pdg = temp; 
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        LongestCommonSubsequence output = new LongestCommonSubsequence();
        int result = output.longestCommonSubsequence(text1,text2);
        System.out.println(result);
    }
}
