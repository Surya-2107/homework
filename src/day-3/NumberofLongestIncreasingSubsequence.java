public class NumberofLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
    int n= nums.length;
        int max = 0;
        int[] length = new int[n];
        int[] ct = new int[n];
        for (int i=0; i<n; i++){
            for (int j=i-1;j>=0;j--){
                if (nums[j]<nums[i]){
                    if (length[j]+1 > length[i]) {
                        length[i] = length[j]+1;
                        ct[i] = ct[j];
                    }else if (length[j]+1 == length[i]){
                        ct[i] = ct[i]+ct[j];
                    }
                }
            }
            if (length[i]==0){
                length[i]=1;
                ct[i]=1;
            }
           max = Math.max(max, length[i]);
        }
        int rst = 0;
        for (int i =0; i<n; i++){
            if(length[i] == max) {
                rst = rst + ct[i];
            }
        }
        return rst;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        NumberofLongestIncreasingSubsequence output = new NumberofLongestIncreasingSubsequence();
        int result = output.findNumberOfLIS(nums);
        System.out.println(result);
    }
}
