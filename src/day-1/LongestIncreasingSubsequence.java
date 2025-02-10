public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] longest = new int[nums.length];
        longest[0]=1;
        int listLength = longest[0];
        for (int i=1; i<nums.length; i++){
            longest[i]=1;
            for (int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    longest[i]=Math.max(longest[i],longest[j]+1);
                }
            }
            listLength = Math.max(listLength,longest[i]);
        }
        return listLength;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        LongestIncreasingSubsequence output = new LongestIncreasingSubsequence();
        int result = output.lengthOfLIS(nums);
        System.out.println(result);
    }
}
