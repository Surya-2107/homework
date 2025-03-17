import java.util.HashMap;

public class LongestArithmeticSubsequence {
    @SuppressWarnings("unchecked")
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int longer = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[n]; 
        for (int i=0; i<n; i++) {
            dp[i] = new HashMap<>();
            for (int j=0; j<i; j++){
                int diff = nums[i] - nums[j];
                dp[i].put(diff,dp[j].getOrDefault(diff,1) + 1);
                longer = Math.max(longer, dp[i].get(diff));
            }
        }
        return longer;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,9,12};
        LongestArithmeticSubsequence output = new LongestArithmeticSubsequence();
        int result = output.longestArithSeqLength(nums);
        System.out.println(result);
    }
}
