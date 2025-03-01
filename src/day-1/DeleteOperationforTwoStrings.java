public class DeleteOperationforTwoStrings {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        int cs = 0;
        for (int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j=0; j<m+1; j++) {
            dp[0][j] = 0;
        }
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = 1+dp[i-1][j-1];
                    cs= Math.max(cs, dp[i][j]);
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return n+m-2*cs;
    }
    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        DeleteOperationforTwoStrings output = new DeleteOperationforTwoStrings();
        int result = output.minDistance(word1,word2);
        System.out.println(result);
    }
}
