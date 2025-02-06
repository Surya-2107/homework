public class MaximumSubArray {
    public int maxSubArray(int[] nums){
        int sum = nums[0];
        int maximum = nums[0];
        int i=1;
        while(i<nums.length){
            sum = Math.max(nums[i],nums[i]+sum);
            maximum = Math.max(sum,maximum);
            i++;
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray output = new MaximumSubArray();
        int result = output.maxSubArray(nums);
        System.out.println(result);
    }
}
