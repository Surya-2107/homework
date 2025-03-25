public class FindMaximumLengthValidSubsequence {
    public int maximumLength(int[] nums) {
        int c = nums[0]%2;
        int odd = 0;
        int even = 0;
        int both = 0;
        for(int num:nums){
            if(num %2 ==0){
                even++;
            }else {
                odd++;
            }
            if (num %2 == c) {
                both++;
                c = 1-c;
            }
        }
        return Math.max(both, Math.max(even,odd));

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        FindMaximumLengthValidSubsequence output = new FindMaximumLengthValidSubsequence();
        int result = output.maximumLength(nums);
        System.out.println(result);
    }
}
